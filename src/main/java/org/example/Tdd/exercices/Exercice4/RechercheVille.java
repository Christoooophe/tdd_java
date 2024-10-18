package org.example.Tdd.exercices.Exercice4;

import org.example.Tdd.exercices.Exercice4.Exception.NotFoundException;

import java.util.ArrayList;
import java.util.List;

public class RechercheVille {

    private final List<String> villes;

    public RechercheVille(List<String> villes) {
        this.villes = villes;
    }

    public List<String> rechercher(String mot)  {
        List<String> result = new ArrayList<>();
        if (mot.equals("*")) {
            return villes;
        }
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
