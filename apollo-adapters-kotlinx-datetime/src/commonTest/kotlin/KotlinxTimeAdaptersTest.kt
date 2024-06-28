import com.apollographql.adapter.datetime.KotlinxInstantAdapter
import com.apollographql.adapter.datetime.KotlinxLocalDateAdapter
import com.apollographql.adapter.datetime.KotlinxLocalDateTimeAdapter
import com.apollographql.adapter.datetime.KotlinxLocalTimeAdapter
import com.apollographql.apollo3.api.Adapter
import com.apollographql.apollo3.api.CustomScalarAdapters
import com.apollographql.apollo3.api.json.BufferedSourceJsonReader
import com.apollographql.apollo3.api.json.buildJsonString
import kotlinx.datetime.TimeZone
import kotlinx.datetime.atTime
import kotlinx.datetime.toInstant
import okio.Buffer
import org.junit.Test
import kotlin.test.assertEquals

class KotlinxTimeAdaptersTest {
  private fun String.jsonReader() = BufferedSourceJsonReader(Buffer().writeUtf8("\"${this}\""))

  private fun <T> Adapter<T>.fromJson(string: String): T {
    return fromJson(string.jsonReader(), CustomScalarAdapters.Empty)
  }

  private fun <T> Adapter<T>.toJson(value: T): String {
    return buildJsonString {
      toJson(this, CustomScalarAdapters.Empty, value)
    }.removePrefix("\"")
        .removeSuffix("\"")
  }

  @Test
  fun kotlinxInstant() {
    var instant = KotlinxInstantAdapter.fromJson("2010-06-01T22:19:44.475Z")
    assertEquals(1275430784475, instant.toEpochMilliseconds())
    assertEquals("2010-06-01T22:19:44.475Z", KotlinxInstantAdapter.toJson(instant))

    instant = KotlinxInstantAdapter.fromJson("2010-06-01T23:19:44.475+01:00")
    assertEquals(1275430784475, instant.toEpochMilliseconds())
    // Time zone is lost
    assertEquals("2010-06-01T22:19:44.475Z", KotlinxInstantAdapter.toJson(instant))
  }

  @Test
  fun kotlinxLocalDateTime() {
    val localDateTime = KotlinxLocalDateTimeAdapter.fromJson("2010-06-01T22:19:44.475")
    assertEquals(1275430784, localDateTime.toInstant(TimeZone.UTC).epochSeconds)
    assertEquals("2010-06-01T22:19:44.475", KotlinxLocalDateTimeAdapter.toJson(localDateTime))
  }

  @Test
  fun kotlinxLocalDate() {
    val localDate = KotlinxLocalDateAdapter.fromJson("2010-06-01")
    assertEquals(1275430784, localDate.atTime(22, 19, 44).toInstant(TimeZone.UTC).epochSeconds)
    assertEquals("2010-06-01", KotlinxLocalDateAdapter.toJson(localDate))
  }

  @Test
  fun kotlinxLocalTime() {
    val localTime = KotlinxLocalTimeAdapter.fromJson("14:35:20")
    assertEquals(14, localTime.hour)
    assertEquals(35, localTime.minute)
    assertEquals(20, localTime.second)
    assertEquals("14:35:20", KotlinxLocalTimeAdapter.toJson(localTime))
  }

}
