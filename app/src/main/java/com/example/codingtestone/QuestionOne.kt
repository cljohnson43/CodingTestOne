package com.example.codingtestone

class QuestionOne {
    fun mostFrequent(arr: Array<Int>): Int {
        var map = mutableMapOf<Int, Int>()

        arr.forEach { key ->
            val value = map.getOrPut(key, {0})
            map.put(key, value + 1 )
        }

        var mostFrequent = 0
        map.keys.forEach { key ->
            if (map.getValue(key) > mostFrequent) {
                mostFrequent = key
            }
        }

        return mostFrequent
    }
}