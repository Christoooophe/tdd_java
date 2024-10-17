package org.example.Exercice4.Exception;

public class NotFoundException extends IllegalArgumentException {
    public NotFoundException() {
        super("Il faut au moins 2 caractères");
    }
}
