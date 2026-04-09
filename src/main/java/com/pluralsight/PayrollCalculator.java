package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator
{
    static void main()
    {
        String name;
        float hours;
        float payRate;
        float grossPay;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter hours worked: ");
        hours = scanner.nextFloat();

        System.out.print("Enter pay rate: ");
        payRate = scanner.nextFloat();

        grossPay = hours * payRate;
        System.out.println("Hello " + name + ", your gross pay is: " + grossPay);
    }
}
