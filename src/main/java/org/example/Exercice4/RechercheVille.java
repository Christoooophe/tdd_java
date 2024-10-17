package org.example.Exercice4;

import org.example.Exercice4.Exception.NotFoundException;

import java.util.List;

public class RechercheVille {
    private List<String> villes;

    public List<String> rechercher(String mot)  {
        if (mot.length() < 2) {
            throw new NotFoundException();
        }
        return null;
    }
}
