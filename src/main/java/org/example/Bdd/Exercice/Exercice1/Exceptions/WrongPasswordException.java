package org.example.Bdd.Exercice.Exercice1.Exceptions;

public class WrongPasswordException extends RuntimeException {
    public WrongPasswordException(String message) {
        super(message);
    }
}
