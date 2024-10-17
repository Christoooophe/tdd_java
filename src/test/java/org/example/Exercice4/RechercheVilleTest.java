package org.example.Exercice4;

import org.example.Exercice4.Exception.NotFoundException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class RechercheVilleTest {
    private RechercheVille rechercheVille;
    private List<String> villes;

    @Before
    public void setUp(){
        List<String> villes = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");
        rechercheVille = new RechercheVille(villes);
    }

    @Test
    public void WhenTextLengthInferior_2_ThenThrowError() {
        String mot = "a";
        Assert.assertThrows(NotFoundException.class, () -> {rechercheVille.rechercher(mot);});
    }

    @Test
    public void WhenTextLengthSuperior_2_ThenReturnVancouverAndValence() {
        String mot = "Va";
        List<String> result = rechercheVille.rechercher(mot);
        Assert.assertArrayEquals(List.of("Valence", "Vancouver").toArray(), result.toArray());
    }

    @Test
    public void WhenTextIsNotWellWrite_ThenShouldBeNotCaseSensitive() {
        String mot = "vA";
        List<String> result = rechercheVille.rechercher(mot);
        Assert.assertArrayEquals(List.of("Valence", "Vancouver").toArray(), result.toArray());
    }

    @Test
    public void WhenTextIsPartOfCityName_ape_ThenShouldReturn_Budapest() {
        String mot = "ape";
        List<String> result = rechercheVille.rechercher(mot);
        Assert.assertArrayEquals(List.of("Budapest").toArray(), result.toArray());
    }

    @Test
    public void WhenTextIsAsterisque_ThenShouldReturnAll() {
        String mot = "*";
        List<String> result = rechercheVille.rechercher(mot);
        Assert.assertArrayEquals(List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul").toArray(), result.toArray());
    }
}
