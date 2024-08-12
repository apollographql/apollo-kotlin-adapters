import com.apollographql.adapter.core.BigDecimal
import com.apollographql.adapter.core.BigDecimalAdapter
import com.apollographql.apollo.api.CustomScalarAdapters
import com.apollographql.apollo.api.json.buildJsonString
import kotlin.test.Test
import kotlin.test.assertEquals

class BigDecimalTests {
  @Test
  fun bigDecimalIsEncodedAsJsonNumber() {
    buildJsonString {
      BigDecimalAdapter.toJson(this, CustomScalarAdapters.Empty, BigDecimal("8"))
    }.apply {
      assertEquals("8", this)
    }
  }
}