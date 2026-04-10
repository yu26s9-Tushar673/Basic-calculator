package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator
{
    public static String getName(Scanner scanner)
    {
        System.out.print("Enter you name: ");
        return scanner.nextLine();
    }

    public static float getHours(Scanner scanner)
    {
        System.out.print("Enter hours worked: ");
        return scanner.nextFloat();
    }

    public static float getRate(Scanner scanner)
    {
        System.out.print("Enter pay rate: ");
        return scanner.nextFloat();
    }

    public static float totalPay(float hours, float rate)
    {
        return hours * rate;

    }

    public static void output(String name, float total)
    {
        System.out.println("Hello " + name + ", your gross pay is: " + total);
    }

    static void main()
    {
        String name;
        float hours;
        float payRate;
        float grossPay;

        Scanner scanner = new Scanner(System.in);

        name = getName(scanner);

        hours = getHours(scanner);

        payRate = getRate(scanner);

        grossPay = totalPay(hours, payRate);

        output(name, grossPay);
    }
}
