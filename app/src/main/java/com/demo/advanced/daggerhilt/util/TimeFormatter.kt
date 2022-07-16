package com.demo.advanced.daggerhilt.util

import java.text.SimpleDateFormat
import java.util.*

class TimeFormatter {

    companion object {
        var TODAY_DATE_FORMAT = SimpleDateFormat("dd MMM yyyy", Locale.getDefault())
    }
}