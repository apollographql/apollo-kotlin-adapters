package com.apollographql.adapter.core

import com.ionspin.kotlin.bignum.decimal.BigDecimal as KBigDecimal

private fun validatedDouble(doubleVal: Double): KBigDecimal {
  check(!doubleVal.isNaN() && !doubleVal.isInfinite())
  return KBigDecimal.fromDouble(doubleVal)
}

actual class BigDecimal internal constructor(internal val raw: KBigDecimal) : Number() {

  actual constructor(strVal: String) : this(KBigDecimal.parseString(strVal))

  actual constructor(doubleVal: Double) : this(validatedDouble(doubleVal))

  actual constructor(intVal: Int) : this(KBigDecimal.fromInt(intVal))

  actual constructor(longVal: Long) : this(KBigDecimal.fromLong(longVal))

  actual fun add(augend: BigDecimal): BigDecimal = BigDecimal(raw.add(augend.raw))

  actual fun subtract(subtrahend: BigDecimal): BigDecimal = BigDecimal(raw.subtract(subtrahend.raw))

  actual fun multiply(multiplicand: BigDecimal): BigDecimal = BigDecimal(raw.multiply(multiplicand.raw))

  actual fun divide(divisor: BigDecimal): BigDecimal = BigDecimal(raw.divide(divisor.raw))

  actual fun negate(): BigDecimal = BigDecimal(raw.negate())

  actual fun signum(): Int = raw.signum()

  override fun toInt(): Int = raw.intValue(exactRequired = false)

  override fun toLong(): Long = raw.longValue(exactRequired = false)

  override fun toShort(): Short = raw.shortValue(exactRequired = false)

  override fun toByte(): Byte = raw.byteValue(exactRequired = false)

  override fun toDouble(): Double = raw.doubleValue(exactRequired = false)

  override fun toFloat(): Float = raw.floatValue(exactRequired = false)

  override fun equals(other: Any?): Boolean = (this === other) || raw == (other as? BigDecimal)?.raw

  override fun hashCode(): Int = raw.hashCode()

  override fun toString(): String = raw.toString()
}

actual fun BigDecimal.toNumber(): Number = this
