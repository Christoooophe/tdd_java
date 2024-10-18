package org.example.Tdd.exercices.Demo1;

import org.example.Tdd.exercices.Demo1.Calcul;
import org.example.Tdd.exercices.exception.DivideByZeroException;
import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

    @Test
    public void whenAddition_1_2_Then_3(){
        Calcul cal = new Calcul();
        double x = 1;
        double y = 2;
        double result = cal.addition(x,y);
        Assert.assertEquals(3,result, 0);
    }

    @Test
    public void whenDivision_6_3_Then_2(){
        Calcul cal = new Calcul();
        double x = 6;
        double y = 3;
        double result = cal.division(x,y);
        Assert.assertEquals(result, 2,0);
    }

    @Test
    public void whenDivision_10_0_Then_DivideByZeroException() {
        Calcul cal = new Calcul();
        double x = 10;
        double y = 0;
        Assert.assertThrows(DivideByZeroException.class, ()->cal.division(x,y));
    }
}
