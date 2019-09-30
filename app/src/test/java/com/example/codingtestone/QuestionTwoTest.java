package com.example.codingtestone;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

public class QuestionTwoTest {

    @Test
    public void isArmstrong() {
        QuestionTwo qTwo = new QuestionTwo();

        // 0, 1, 153, 370, 371 and 407
        // case_one
        long arg = 407;
        boolean expected = true;
        boolean result = qTwo.isArmstrong(arg);

        assertEquals(expected, result);

        // case_two
        arg = 3;
        expected = false;
        result = qTwo.isArmstrong(arg);

        assertEquals("case_two", expected, result);

        // case_three
        arg = 371;
        expected = true;
        result = qTwo.isArmstrong(arg);

        assertEquals("case_three", expected, result);

        // case_four
        arg = 0;
        expected = true;
        result = qTwo.isArmstrong(arg);

        assertEquals("case_four", expected, result);
    }

    @Test
    public void numDigits() {
        QuestionTwo qTwo = new QuestionTwo();

        long base = 1268989873;
        long expected = 10;

        long result = qTwo.numDigits(base);

        assertEquals(expected, result);
    }
}