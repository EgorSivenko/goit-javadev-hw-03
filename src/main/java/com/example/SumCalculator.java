package com.example;

public class SumCalculator {
    /**
     * Returns the sum of first {@code n} positive integers.
     *
     * @param  n a total number of integers.
     * @return the sum of numbers from 1 to {@code n} inclusive.
     * @throws IllegalArgumentException if the total number of integers is {@code 0} or negative.
     */
    public int sum(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("Total number of integers must be > 0");

        return n * (n + 1) / 2; // Time complexity: O(1)
    }
}
