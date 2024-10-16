package org.example.Demo1;

import org.junit.Assert;
import org.junit.Test;

public class GradingCalculatorTest {

    @Test
    public void whenScore_95_And_Presence_90_Then_A() {
        int score = 95;
        int presence = 90;
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);
        char result = gradingCalculator.getGrade();
        Assert.assertEquals('A', result);
    }

    @Test
    public void whenScore_85_And_Presence_90_Then_B() {
        int score = 85;
        int presence = 90;
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);
        char result = gradingCalculator.getGrade();
        Assert.assertEquals('B', result);
    }

    @Test
    public void whenScore_65_And_Presence_90_Then_C() {
        int score = 65;
        int presence = 90;
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);
        char result = gradingCalculator.getGrade();
        Assert.assertEquals('C', result);
    }

    @Test
    public void whenScore_95_And_Presence_65_Then_B() {
        int score = 95;
        int presence = 65;
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);
        char result = gradingCalculator.getGrade();
        Assert.assertEquals('B', result);
    }

    @Test
    public void whenScore_95_And_Presence_55_Then_F() {
        int score = 95;
        int presence = 55;
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);
        char result = gradingCalculator.getGrade();
        Assert.assertEquals('F', result);
    }

    @Test
    public void whenScore_65_And_Presence_55_Then_F() {
        int score = 65;
        int presence = 55;
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);
        char result = gradingCalculator.getGrade();
        Assert.assertEquals('F', result);
    }

    @Test
    public void whenScore_50_And_Presence_90_Then_F() {
        int score = 50;
        int presence = 90;
        GradingCalculator gradingCalculator = new GradingCalculator(score, presence);
        char result = gradingCalculator.getGrade();
        Assert.assertEquals('F', result);
    }
}


//- Score : 95%, Présence : 90 => Note: A
//- Score : 85%, Présence : 90 => Note: B
//- Score : 65%, Présence : 90 => Note: C
//- Score : 95%, Présence : 65 => Note: B
//- Score : 95%, Présence : 55 => Note: F
//- Score : 65%, Présence : 55 => Note: F
//- Score : 50%, Présence : 90 => Note: F
