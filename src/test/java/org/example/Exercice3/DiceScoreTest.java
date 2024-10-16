package org.example.Exercice3;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class DiceScoreTest {
    private DiceScore diceScore;
    private Ide de = Mockito.mock(Ide.class);

    @Test
    public void whenDicesAreSame_5_ThenEquals_20() {
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(5).thenReturn(5);

        int result = diceScore.getScore();

        Assert.assertEquals(20, result);
    }

    @Test
    public void whenDicesAreSame_6_ThenEquals_30() {
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(6).thenReturn(6);

        int result = diceScore.getScore();

        Assert.assertEquals(30, result);
    }

    @Test
    public void whenDicesAreNotSame_4_5_ThenEquals_20() {
        diceScore = new DiceScore(de);
        Mockito.when(de.getRoll()).thenReturn(4).thenReturn(5);

        int result = diceScore.getScore();

        Assert.assertEquals(5, result);
    }
}
