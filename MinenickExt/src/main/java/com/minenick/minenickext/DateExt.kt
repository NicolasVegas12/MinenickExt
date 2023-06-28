package com.minenick.minenickext

import java.text.SimpleDateFormat
import java.util.*


//DateTime
private val dateFormatData = SimpleDateFormat("yyyy-dd-MM")
fun Date.toDateFormatData() = dateFormatData.format(this)
//----------------------------------------------------------------------------
private val dateFormatData2 = SimpleDateFormat("yyyy-MM-dd")
fun Date.toDateFormatData2() = dateFormatData2.format(this)
//----------------------------------------------------------------------------
private val dateFormat = SimpleDateFormat("dd/MM/yyyy")
fun Date.toDateFormat() = dateFormat.format(this)
//----------------------------------------------------------------------------
private val timeFormatData = SimpleDateFormat("HH:mm:ss")
fun Date.toTimeFormatData() = timeFormatData.format(this)
//----------------------------------------------------------------------------
private val timeFormat = SimpleDateFormat("HH:mm")
fun Date.toTimeFormat() = timeFormat.format(this)
//----------------------------------------------------------------------------
private val dateTimeFormat = SimpleDateFormat("dd/MM/yyyy HH:mm")
fun Date.toDateTimeFormat() = dateTimeFormat.format(this)
//----------------------------------------------------------------------------
private val dateTimeFormatData = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
fun Date.toDateTimeFormatData() = dateTimeFormatData.format(this)
//----------------------------------------------------------------------------
private val dateTimeFormatData2 = SimpleDateFormat("yyyy-dd-MM HH:mm:ss")
fun Date.toDateTimeFormatData2() = dateTimeFormatData2.format(this)
//----------------------------------------------------------------------------
private val dateTimeFormatSql = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss")
fun Date.toDateTimeFormatSql() = dateTimeFormatSql.format(this)
//----------------------------------------------------------------------------
private val dayNameFormat = SimpleDateFormat("EEEE",Locale.getDefault())
fun Date.toDayNameFormat() = dayNameFormat.format(this)
//----------------------------------------------------------------------------
private val monthNameFormat = SimpleDateFormat("MMMM",Locale.getDefault())
fun Date.toMonthNameFormat() = monthNameFormat.format(this)
//----------------------------------------------------------------------------
private val dayFormat = SimpleDateFormat("d",Locale.getDefault())
fun Date.toDayFormat() = dayFormat.format(this)
//----------------------------------------------------------------------------

fun String.toDateTimeFormatData() = dateTimeFormatData.parse(this)
fun String.toDateTimeFormat() = dateTimeFormat.parse(this)
fun String.toDateFormat() = dateFormatData2.parse(this)
fun String.toTimeFormat() = timeFormat.parse(this)
fun String.toDateTimeFormatSql() = dateTimeFormatSql.parse(this)

