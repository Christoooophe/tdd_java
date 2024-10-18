package org.example.Tdd.exercices.Exercice2;

import org.example.Tdd.exercices.Exercice2.Fib;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FibTest {
    private Fib fib;

    @Test
    public void whenRangeIs_1_ThenResultNotEmpty() {
        fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();
        Assert.assertFalse(result.isEmpty());
    }

    @Test
    public void whenRangeIs_1_ThenResultContains0() {
        fib = new Fib(1);
        List<Integer> result = fib.getFibSeries();
        Assert.assertTrue(result.contains(0));
    }

    @Test
    public void whenRangeIs_6_ThenResultContains6Elements() {
        fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        Assert.assertEquals(6, result.size());
    }

    @Test
    public void whenRangeIs_6_ThenResultContains_3() {
        fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        Assert.assertTrue(result.contains(3));
    }

    @Test
    public void whenRangeIs_6_ThenResultNotContain_4() {
        fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        Assert.assertFalse(result.contains(4));
    }

    @Test
    public void whenRangeIs_6_ThenResultEquals_0_1_2_3_5() {
        fib = new Fib(6);
        List<Integer> result = fib.getFibSeries();
        Assert.assertEquals(List.of(0, 1, 1, 2, 3, 5),result);
    }
}
