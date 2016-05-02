package com.github.pjozsef.extension.core.longdate

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

fun Long.asCalendar(): Calendar {
    val cal = Calendar.getInstance()
    cal.timeInMillis = this
    return cal
}

fun Long.asDate() = Date(this)

fun Long.format(formatString: String): String = SimpleDateFormat(formatString).format(this.asDate())

fun Long.formatAsDateTime() = this.format("yyyy-MM-dd HH:mm:ss")

fun Long.formatAsDate() = this.format("yyyy-MM-dd")
