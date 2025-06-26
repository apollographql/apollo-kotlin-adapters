import com.apollographql.adapter.core.KotlinInstantAdapter
import com.apollographql.apollo.api.Adapter
import com.apollographql.apollo.api.CustomScalarAdapters
import com.apollographql.apollo.api.json.BufferedSourceJsonReader
import com.apollographql.apollo.api.json.buildJsonString
import okio.Buffer
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.time.ExperimentalTime

@ExperimentalTime
class KotlinInstantAdapterTest {
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
  fun kotlinInstant() {
    var instant = KotlinInstantAdapter.fromJson("2010-06-01T22:19:44.475Z")
    assertEquals(1275430784475, instant.toEpochMilliseconds())
    assertEquals("2010-06-01T22:19:44.475Z", KotlinInstantAdapter.toJson(instant))

    instant = KotlinInstantAdapter.fromJson("2010-06-01T23:19:44.475+01:00")
    assertEquals(1275430784475, instant.toEpochMilliseconds())
    // Time zone is lost
    assertEquals("2010-06-01T22:19:44.475Z", KotlinInstantAdapter.toJson(instant))
  }
}
