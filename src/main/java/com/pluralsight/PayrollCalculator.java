package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Requesting name input
        System.out.println("Enter full name: ");
        String name = scanner.nextLine();

        // Asking for how many hours worked.
        System.out.println("Enter hours worked: ");
        double hoursWorked = scanner.nextDouble();

        // Asking for pay rate.
        System.out.println("Enter your pay-rate: ");
        double payRate = scanner.nextDouble();

        // Check if Overtime calculations apply or not and calculate total real gross.
        double grossPay;
        if (hoursWorked <= 40) {
            grossPay = hoursWorked * payRate;
        } else {
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * payRate * 1.5;
            double regularPay = 40 * payRate; // Declaring regular pay of 40 hours as it will be added onto overtime pay for gross pay.
            grossPay = regularPay + overtimePay;
        }

        // Printing Full name and gross pay calculated
        System.out.printf("%s, you worked %.2f hours and your gross pay is %.2f.\n", name, hoursWorked, grossPay);

    }
}
