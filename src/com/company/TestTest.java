package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class TestTest {

    @Test
    public void sum() {
        Testclass numbers = new Testclass();
        int actual = numbers.sum(11);
        int expected = 66;
        assertEquals(actual,expected);

    }
}