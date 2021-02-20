package com.tts;
import java.util.*;

public class TrigCalculator extends Main {
    public static void main(String[] args) {
        double num;
        Scanner input = new Scanner(System.in);

        System.out.println("Which operation would you like? (sqrt, sin, cos, tan, fact): ");
        String operation = input.nextLine();

        switch (operation) {
            case "sqrt":
                System.out.println("What number would you like the square root of?");
                System.out.println(Math.pow(input.nextInt(), 0.5));
            break;

            case "sin":
                System.out.println("What number would you like to sin?");
                System.out.println(Math.sin(input.nextInt()));
            break;

            case "cos":
                System.out.println("What number do you want in the cos?");
                System.out.println(Math.sin(input.nextInt()));
            break;

            case "tan":
                System.out.println("What number do you want in the tan?");
                System.out.println(Math.tan(input.nextInt()));
            break;

            case "fact":
                int n, c, f = 1;
                System.out.println("What number do you want to calculate its factorial?");

                n = input.nextInt();

                if ( n < 0) {
                    System.out.println("Number should be non-negative");
                } else {
                    for (c = 1; c <= n; c++)
                        f = f * c;
                    System.out.println(f);
                }
                break;

            default:
                break;

        }
        input.close();
    }

}
