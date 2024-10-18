package org.example.Tdd.exercices.Demo2;

import org.example.Tdd.exercices.Demo2.Ide;
import org.example.Tdd.exercices.Demo2.Jeu;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class JeuTest {
    private Jeu jeu;

    private Ide de = Mockito.mock(Ide.class);

    @Test
    public void whenDeThrownWithValue7_ThenReturnJeuValue() {
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(7);

        boolean result = jeu.jouer();

        Assert.assertTrue(result);
    }

    @Test
    public void whenDeThrownWithValue8_ThenReturnJeuFalse() {
        jeu = new Jeu(de);
        Mockito.when(de.lancer()).thenReturn(8);

        boolean result = jeu.jouer();

        Assert.assertFalse(result);
    }
}
