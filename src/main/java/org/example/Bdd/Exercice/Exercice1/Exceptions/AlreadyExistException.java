package org.example.Bdd.Exercice.Exercice1.Exceptions;

public class AlreadyExistException extends RuntimeException {
    public AlreadyExistException() {
        super("Un utilisateur existe déjà avec ce mail");
    }
}
