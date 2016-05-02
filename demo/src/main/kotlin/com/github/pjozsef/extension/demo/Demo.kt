package com.github.pjozsef.extension.demo

import com.github.pjozsef.extension.core.bool.*
import com.github.pjozsef.extension.core.integer.*
import com.github.pjozsef.extension.core.longdate.*
import java.text.SimpleDateFormat
import java.util.*


fun booleanDemo(dummyBoolean: Boolean, trueTask: () -> Unit, falseTask: () -> Unit) {
    dummyBoolean {
        trueTask()
    } otherwise {
        falseTask()
    }

    //instead of
    if (dummyBoolean) {
        trueTask()
    } else {
        falseTask()
    }
}

fun integerDemo(number: Int){
    number.times{
        println("Counting: $it")
    }

    //instead of
    for(i in 0..number-1){
        println("Counting: $i")
    }
}

fun longAsCalendar_Or_AsDateDemo(long: Long){
    val cal = long.asCalendar()
    val date = long.asDate()

    //instead of
    val cal2 = Calendar.getInstance()
    cal.timeInMillis = long

    val date2 = Date(long)
}

fun longDateFormatDemo(long: Long, customFormatString: String){
    val custom: String = long.format(customFormatString)
    val dateTime: String = long.formatAsDateTime()
    val date: String = long.formatAsDate()

    //instead of
    val formatter = SimpleDateFormat(customFormatString)
    val custom2 = formatter.format(Date(long))
}