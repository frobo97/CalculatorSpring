package com.calculator.Calculator.Spring;

import java.util.Scanner;

public class calculatorController {


    public static void dataFromTheConsole() {
        // fixa så det går att köra flera nummer samtidigt.

        boolean exit;
        String instruction = "Please enter the calculation you wold like to do\nWrite EXIT to exit";
        CalculatorMath calculatorMath = new CalculatorMath();
        do {
            exit = false;
            System.out.println(instruction);

            Scanner scannerIn = new Scanner(System.in);
            String dataIn = scannerIn.nextLine();
            if (dataIn.equalsIgnoreCase("EXIT")) {
                System.out.println("You have exited the program");
                break;
            } else {

                String[] values = dataIn.split("((?=:|#|\\+)|(?<=:|#|\\+)|(?=:|#|\\-)|(?<=:|#|\\-)|(?=:|#|\\*)|(?<=:|#|\\*)|(?=:|#|\\/)|(?<=:|#|\\/))");
                String numberOneString = values[0];
                String operand = values[1];
                String numberTwoString = values[2];
                double firstNUmber = Double.parseDouble(numberOneString);
                double secondNUmber = Double.parseDouble(numberTwoString);

                switch (operand) {
                    case "+":
                        double addition = calculatorMath.addition(firstNUmber, secondNUmber);
                        System.out.println("result = " + addition);
                        break;
                    case "-":
                        double subtraction = calculatorMath.subtraction(firstNUmber, secondNUmber);
                        System.out.println("result = " + subtraction);
                        break;
                    case "/":
                        double division = calculatorMath.division(firstNUmber, secondNUmber);
                        System.out.println("result = " + division);
                        break;
                    case "*":
                        double multiplication = calculatorMath.multiplication(firstNUmber, secondNUmber);
                        System.out.println("result = " + multiplication);
                        break;
                    default:
                        System.out.println("something went wrong");
                }
            }

        } while (!exit);


    }
}
