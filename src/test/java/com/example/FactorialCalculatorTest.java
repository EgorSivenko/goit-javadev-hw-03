package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.*;

class FactorialCalculatorTest {
    FactorialCalculator calculator;

    @BeforeEach
    void setup() {
        calculator = new FactorialCalculator();
    }

    @AfterEach
    void cleanup() {
        calculator = null;
    }

    @Test
    @DisplayName("Factorial of 0 is 1")
    void factorial_of_zero_is_one() {
        int n = 0;
        BigInteger actual = calculator.factorial(n);

        BigInteger expected = BigInteger.ONE;
        assertThat(actual)
                .as("Factorial of %d should be %d, but it's %d", n, expected, actual)
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("Factorial of 1 is 1")
    void factorial_of_one_is_one() {
        int n = 1;
        BigInteger actual = calculator.factorial(n);

        BigInteger expected = BigInteger.ONE;
        assertThat(actual)
                .as("Factorial of %d should be %d, but it's %d", n, expected, actual)
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("Factorial of 4 is 24")
    void factorial_of_four_is_twenty_four() {
        int n = 4;
        BigInteger actual = calculator.factorial(n);

        BigInteger expected = BigInteger.valueOf(24);
        assertThat(actual)
                .as("Factorial of %d should be %d, but it's %d", n, expected, actual)
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("Factorial of 5 is 120")
    void factorial_of_five_is_one_hundred_twenty() {
        int n = 5;
        BigInteger actual = calculator.factorial(n);

        BigInteger expected = BigInteger.valueOf(120);
        assertThat(actual)
                .as("Factorial of %d should be %d, but it's %d", n, expected, actual)
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("Factorial of -1 throws an exception")
    void factorial_of_negative_number_throws_an_exception() {
        int n = -1;
        assertThatIllegalArgumentException()
                .as("Factorial of %d must throw an exception", n)
                .isThrownBy(() -> calculator.factorial(n));
    }
}