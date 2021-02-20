package com.tts;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num1;
        double num2;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second whole number: ");
        num2 = input.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^, %, √): ");
        char operator = input.next().charAt(0);

        input.close();
        double output;

        switch(operator) {
            case '+':
                output = num1 + num2;
                break;

            case '-':
                output = num1 - num2;
                break;

            case '*':
                output = num1 * num2;
                break;

            case '/':
                output = num1 / num2;
                break;

            case '^':
                output = Math.pow(num1, num2);
                break;

            case '%':
                output = num1 % num2;
                break;

            default:
                System.out.printf("Invalid operator");
                return;
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + output);
    }


}
