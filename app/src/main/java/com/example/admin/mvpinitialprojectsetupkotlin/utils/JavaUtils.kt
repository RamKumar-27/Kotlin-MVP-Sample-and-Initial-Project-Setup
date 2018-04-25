package com.example.admin.mvpinitialprojectsetupkotlin.utils

import java.lang.Double.parseDouble


object JavaUtils {

    fun convertListToArray(longs: List<Long>): Array<Long> {
        return longs.toTypedArray()
    }

    fun isValidDouble(stringDouble: String?): Boolean {
        if (stringDouble == null || stringDouble.isEmpty()) {
            return false
        }
        try {
            parseDouble(stringDouble)
            return true
        } catch (e: NumberFormatException) {
            return false
        }

    }

    fun safeCastToDouble(stringDouble: String?): Double? {
        if (stringDouble == null || stringDouble.isEmpty()) {
            return null
        }
        try {
            return parseDouble(stringDouble)
        } catch (e: NumberFormatException) {
            return null
        }

    }
}
