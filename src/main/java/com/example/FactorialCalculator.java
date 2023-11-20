package com.example;

import com.google.common.math.BigIntegerMath;

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
        return BigIntegerMath.factorial(n);
    }
}
