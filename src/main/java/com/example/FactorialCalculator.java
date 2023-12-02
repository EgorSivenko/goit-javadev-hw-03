package com.example;

import java.math.BigInteger;

public class FactorialCalculator {
    /**
     * Returns the factorial of a positive number {@code n}.
     *
     * @param  n a number.
     * @return the factorial of {@code n}.
     * @throws IllegalArgumentException if {@code n} is negative.
     */
    public BigInteger factorial(int n) {
        if (n < 0)
            throw new IllegalArgumentException("Number must be >= 0");

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
