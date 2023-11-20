package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {
    SumCalculator calculator;

    @BeforeEach
    void setup() {
        calculator = new SumCalculator();
    }

    @AfterEach
    void cleanup() {
        calculator = null;
    }

    @Test
    @DisplayName("Sum of first positive integer is 1")
    void sum_of_first_positive_integer_is_one() {
        int actual = calculator.sum(1);

        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sum of first 3 integers is 6")
    void sum_of_first_three_integers_is_six() {
        int actual = calculator.sum(3);

        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sum of first 10 integers is 55")
    void sum_of_first_ten_integers_is_fifty_five() {
        int actual = calculator.sum(10);

        int expected = 55;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sum of 0 integers throws an exception")
    void sum_of_zero_integers_throws_an_exception() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }

    @Test
    @DisplayName("Sum of negative number of integers throws an exception")
    void sum_of_negative_number_of_integers_throws_an_exception() {
        assertThrows(IllegalArgumentException.class, () -> calculator.sum(-1));
    }
}