package org.example.Exercice4;

import org.example.Exercice4.Exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class RechercheVille {
    private final List<String> villes = List.of("Paris", "Budapest", "Skopje", "Rotterdam", "Valence", "Vancouver", "Amsterdam", "Vienne", "Sydney", "New York", "Londres", "Bangkok", "Hong Kong", "Dubaï", "Rome", "Istanbul");

    public List<String> rechercher(String mot)  {
        List<String> result = new ArrayList<>();
        if (mot.length() > 1) {
            for (String ville : villes) {
                if (ville.toLowerCase().contains(mot.toLowerCase())) {
                    result.add(ville);
                }
            }
            return result;
        }
        throw new NotFoundException();
    }
}
