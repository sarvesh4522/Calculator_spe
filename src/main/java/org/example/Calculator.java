package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator
{
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public Calculator()
    {
    }

    public static void main(String[] args)
    {

        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        scanner.nextLine();
        do
        {
            System.out.println("Calculator-using-DevOps, choose an operation");
            System.out.print("Press 1 for Square Root\nPress 2 for Factorial\nPress 3 for Natural Logarithm\nPress 4 for Power\n" +
                    "Press 5 to exit\nEnter your choice: ");
            int choice;
            try
            {
                choice = scanner.nextInt();
            } catch (InputMismatchException error)
            {
                return;
            }

            switch (choice)
            {
                case 0:
                    System.out.println("Welcome to the calculator!");
                    break;

                case 1:
                    // do square root
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square root of " + number1 + " is : " + calculator.squareroot(number1));
                    System.out.println("\n");

                    break;
                case 2:
                    // find factorial
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Factorial of " + number1 + " is : " + calculator.factorial(number1));
                    System.out.println("\n");

                    break;
                case 3:
                    // find natural logarithm
                    System.out.print("Enter a number : ");
                    number1 = scanner.nextDouble();
                    System.out.println("Square of " + number1 + " is : " + calculator.naturalLog(number1));
                    System.out.println("\n");

                    break;
                case 4:
                    // do power
                    System.out.print("Enter the first number : ");
                    number1 = scanner.nextDouble();
                    System.out.print("Enter the second number : ");
                    number2 = scanner.nextDouble();
                    System.out.println("Power of " + number1 + " raised to " + number2 + " is : " + calculator.power(number1, number2));
                    System.out.println("\n");

                    break;
                default:
                    System.out.println("Exiting now...");
                    return;
            }
        } while (true);
    }


    public double power(double number1, double number2)
    {
        logger.info("[POWER - " + number1 + " AND " + number2);
        double result = Math.pow(number1, number2);
        logger.info("[RESULT - POWER] - " + result);
        return result;
    }

    public double squareroot(double number1)
    {
        logger.info("[SQUARE ROOT] - " + number1);
        double result = Math.sqrt(number1);
        logger.info("[RESULT - SQUARE ROOT] - " + result);
        return result;
    }

    public double factorial(double number1)
    {
        logger.info("[FACTORIAL] - " + number1);

        int result = 1, i;
        for (i=2; i<=number1; i++)
            result *= i;

        logger.info("[RESULT - FACTORIAL] - " + result);
        return result;
    }

    public double naturalLog(double number1)
    {
        logger.info("[NATURAL LOG] - " + number1);
        double result = Math.log(number1);
        logger.info("[RESULT - NATURAL LOG] - " + result);
        return result;
    }

}