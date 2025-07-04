package com.codurance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorShould {

    @Test
    void returnZeroWhenInputIsEmpty() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    void returnNumberWhenOnlyOneNumberIsGiven() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(1, calculator.add("1"));
    }

    @Test
    void returnSumWhenTwoCommaSeparatedNumbersAreGiven() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("1,2"));
    }

    @Test
    void returnSumWhenNewLineIsUsedAsSeparatorAlongWithComma() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("1\n2,3"));
    }

    @Test
    void returnSumWhenCustomDelimiterIsProvided() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(3, calculator.add("//;\n1;2"));
    }

    @Test
    void throwExceptionWhenNegativeNumbersAreProvided() {
        StringCalculator calculator = new StringCalculator();

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.add("1,-2,3,-4");
        });

        assertEquals("negative numbers not allowed: -2,-4", exception.getMessage());
    }

    @Test
    void ignoreNumbersGreaterThanThousand() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(2, calculator.add("2,1001"));
    }

    @Test
    void supportDelimiterOfAnyLength() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("//[***]\n1***2***3"));
    }

    @Test
    void supportMultipleDelimiters() {
        StringCalculator calculator = new StringCalculator();
        assertEquals(6, calculator.add("//[*][%]\n1*2%3"));
    }




}
