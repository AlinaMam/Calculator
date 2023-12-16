package org.example;

import org.hamcrest.core.Is;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void sum() {
        int result = Calculator.sum(2, 3);
        Assert.assertThat(result, Is.is(5));
    }
    @Test
    public void sub() {
        int result = Calculator.sub(6, 3);
        Assert.assertThat(result, Is.is(3));
    }
    @Test
    public void mul() {
        int result = Calculator.mul(8, 2);
        Assert.assertThat(result, Is.is(16));
    }
    @Test
    public void div() {
        int result = Calculator.div(50, 10);
        Assert.assertThat(result, Is.is(5));
    }
    @Test(expected = ArithmeticException.class)
    public void divByZero() {
        int result = Calculator.div(50, 0);
    }
}
