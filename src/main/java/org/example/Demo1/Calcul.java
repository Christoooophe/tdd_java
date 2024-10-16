package org.example.Demo1;

import org.example.exception.DivideByZeroException;

public class Calcul {
    public Calcul() {}

    public double addition(double a, double b) {
        return a + b;
    }

    public double division(double a, double b) {
        if (b!= 0) {
            return a / b;
        }

        throw new DivideByZeroException();
    }
}
