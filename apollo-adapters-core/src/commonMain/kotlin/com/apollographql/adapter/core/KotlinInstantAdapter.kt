package com.apollographql.adapter.core

import com.apollographql.apollo.api.Adapter
import com.apollographql.apollo.api.CustomScalarAdapters
import com.apollographql.apollo.api.json.JsonReader
import com.apollographql.apollo.api.json.JsonWriter
import kotlin.time.ExperimentalTime
import kotlin.time.Instant

/**
 * An [Adapter] that converts an ISO 8601 String like "2010-06-01T22:19:44.475Z" to/from
 * a [kotlin.time.Instant]
 *
 * It requires Android Gradle plugin 4.0 or newer and [core library desugaring](https://developer.android.com/studio/write/java8-support#library-desugaring).
 */
@ExperimentalTime
object KotlinInstantAdapter : Adapter<Instant> {
  override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters): Instant {
    return Instant.parse(reader.nextString()!!)
  }

  override fun toJson(writer: JsonWriter, customScalarAdapters: CustomScalarAdapters, value: Instant) {
    writer.value(value.toString())
  }
}
