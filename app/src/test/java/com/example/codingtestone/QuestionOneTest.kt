package com.example.codingtestone

import org.junit.Test

import org.junit.Assert.*

class QuestionOneTest {

    @Test
    fun mostFrequent() {
        var qOne = QuestionOne()

        // case_one
        var arg = arrayOf(43, 43, 1, 2, 4, 6, 7, 9, 10)
        var expected = 43
        var actual = qOne.mostFrequent(arg)

        assertEquals("case_one", expected, actual)

        // case_two
        arg = arrayOf(10, 43, 1, 2, 4, 6, 7, 9, 10)
        expected = 10
        actual = qOne.mostFrequent(arg)

        assertEquals("case_two", expected, actual)

        // case_three
        arg = arrayOf(1)
        expected = 1
        actual = qOne.mostFrequent(arg)

        assertEquals("case_three", expected, actual)

    }
}