package org.example.Exercice4;

import org.junit.Assert;
import org.junit.Test;

public class RechercheVilleTest {
    private RechercheVille rechercheVille;

    @Test
    public void WhenTextLengthInferior_2_ThenThrowError() {
        rechercheVille = new RechercheVille();
        String test = "a";
        Assert.assertThrows(NotFoundException.class, () -> {rechercheVille.rechercher(test);});
    }
}
