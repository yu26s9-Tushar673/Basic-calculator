package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator
{
    static void main() {
        float first;
        float second;
        float result;
        String operation;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");
        first = scanner.nextFloat();

        System.out.print("Enter second number:");
        second = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Possible calculations: \n(A)dd" +
                "\n(S)ubtract" +
                "\n(M)ultiply" +
                "\n(D)ivide");
        System.out.print("Please select an option: ");
        operation = scanner.nextLine();

        result = first * second;
        System.out.println("Result : " + result);
    }


}
