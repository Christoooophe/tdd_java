package org.example.Tdd.exercices.exception;

public class DivideByZeroException extends RuntimeException {
    public DivideByZeroException() {
        super("On divise pas par 0");
    }

}
