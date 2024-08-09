package com.apollographql.adapter.core

import com.apollographql.apollo.api.Adapter
import com.apollographql.apollo.api.CustomScalarAdapters
import com.apollographql.apollo.api.json.JsonReader
import com.apollographql.apollo.api.json.JsonWriter

object UnitAdapter : Adapter<Unit> {
  override fun fromJson(reader: JsonReader, customScalarAdapters: CustomScalarAdapters): Unit {
    reader.skipValue()
  }

  override fun toJson(writer: JsonWriter, customScalarAdapters: CustomScalarAdapters, value: Unit) {
    error("Void used in input position")
  }
}
