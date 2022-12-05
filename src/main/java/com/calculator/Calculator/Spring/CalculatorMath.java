package com.calculator.Calculator.Spring;

public class CalculatorMath {

    public double addition(double one, double tow) {
        return one + tow;
    }

    public double subtraction(double one, double tow) {
        return one - tow;
    }

    public double multiplication(double one, double tow) {
        return one * tow;
    }

    public double division(double one, double tow) {
        if (one == 0 || tow == 0) {
            System.out.println("Division by zero is not possible");
            return 0;
        }
        return one / tow;
    }


}
