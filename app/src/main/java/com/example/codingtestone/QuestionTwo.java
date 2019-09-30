package com.example.codingtestone;

public class QuestionTwo {
    public boolean isArmstrong(long number) {
        long sum = 0;
        long base = number;
        while (base > 0) {
            long digit = base % 10;
            sum += (long) Math.pow(digit, 3);
            base /= 10;
        }

        return sum == number;
    }

    public long numDigits(long x) {
        long numDigits = 0;

        long base = 10;
        while(true) {
            if (x % base != 0) {
                x /= base;
                numDigits++;

            } else {
                return numDigits;
            }
        }
    }
}
