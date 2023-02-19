package com.example.demo;

//import android.test.suitebuilder.annotation.SmallTest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;


/**
 * JUnit4 unit tests for the calculator logic. These are local unit tests; no device needed
 */
@RunWith(JUnit4.class)

public class CalculatorTest {

    private Calculator mCalculator;

    /**
     * Set up the environment for testing
     */
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }

    /**
     * Test for simple addition
     */
    @Test
    public void addTwoNumbers2() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, equalTo(2d));
    }

    @Test
    public void mulTwoNumbers() {
        double resultAdd = mCalculator.mul(2d, 5d);
        assertThat(resultAdd, equalTo(10d));
    }

    @Test
    public void divTwoNumbers() {
        double resultAdd = mCalculator.div(35d, 7d);
        assertThat(resultAdd, equalTo(5d));
    }

    @Test
    public void subTwoNumbers() {
        double resultAdd = mCalculator.sub(35d, 7.6d);
        assertThat(resultAdd, equalTo(27.4d));
    }

    @Test
    public void addTwoNumbers() {
        double resultAdd = mCalculator.add(1d, 1d);
        assertThat(resultAdd, equalTo(2d));
    }

    @Test
    public void addTwoNumbersNegative() {
        double resultAdd = mCalculator.add(-1d, 2d);
        assertThat(resultAdd, equalTo(1d));
    }


    @Test
    public void subTwoNumbers2() {
        double resultSub = mCalculator.sub(1d, 1d);
        assertThat(resultSub, equalTo(0d));
    }

    @Test
    public void subWorksWithNegativeResult() {
        double resultSub = mCalculator.sub(1d, 17d);
        assertThat(resultSub, equalTo(-16d));
    }

    @Test
    public void mulTwoNumbers2() {
        double resultMul = mCalculator.mul(32d, 2d);
        assertThat(resultMul, equalTo(64d));
    }

    @Test
    public void divTwoNumbers3() {
        double resultDiv = mCalculator.div(32d,2d);
        assertThat(resultDiv, equalTo(16d));
    }

    @Test
    public void divTwoNumbersZero() {
        double resultDiv = mCalculator.div(32d,0);
        assertThat(resultDiv, equalTo(Double.POSITIVE_INFINITY));
    }



}