package org.example.Exercice4;

import org.example.Exercice4.Exception.NotFoundException;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RechercheVilleTest {
    private RechercheVille rechercheVille;

    @Test
    public void WhenTextLengthInferior_2_ThenThrowError() {
        rechercheVille = new RechercheVille();
        String mot = "a";
        Assert.assertThrows(NotFoundException.class, () -> {rechercheVille.rechercher(mot);});
    }

    @Test
    public void WhenTextLengthSuperior_2_ThenReturnVancouverAndValence() {
        rechercheVille = new RechercheVille();
        String mot = "Va";
        List<String> result = rechercheVille.rechercher(mot);
        Assert.assertArrayEquals(List.of("Valence", "Vancouver").toArray(), result.toArray());
    }

    @Test
    public void WhenTextIsNotWellWrite_ThenShouldBeNotCaseSensitive() {
        rechercheVille = new RechercheVille();
        String mot = "vA";
        List<String> result = rechercheVille.rechercher(mot);
        Assert.assertArrayEquals(List.of("Valence", "Vancouver").toArray(), result.toArray());
    }

    @Test
    public void WhenTextIsPartOfCityName_ape_ThenShouldReturn_Budapest() {
        rechercheVille = new RechercheVille();
        String mot = "ape";
        List<String> result = rechercheVille.rechercher(mot);
        Assert.assertArrayEquals(List.of("Budapest").toArray(), result.toArray());
    }
}
