package org.example.exercices;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class GradingCalculatorTest {

    @Parameterized.Parameter(value = 0)
    public int score;
    @Parameterized.Parameter(value = 1)
    public int presence;
    @Parameterized.Parameter(value = 2)
    public char result;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                { 95, 90, 'A' },
                { 85, 90, 'B' },
                { 65, 90, 'C' },
                { 95, 65, 'B' },
                { 95, 55, 'F' },
                { 65, 55, 'F' },
                { 50, 90, 'F' },
        });
    }

    @Test
    public void shouldReturnCorrectGrade() {
        GradingCalculator gradingCalculator1 = new GradingCalculator(score, presence);
        char test = gradingCalculator1.getGrade();
        Assert.assertEquals(result, test);
    }

}

