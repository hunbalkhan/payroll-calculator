package com.pluralsight;

import java.util.Scanner;

public class TaxiFareCalculator {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asks the user/driver for the number of miles travelled.
        System.out.println("Number of miles traveled: ");
        double miles = scanner.nextDouble();

        // Asks the user/driver for the waiting time.
        System.out.println("Waiting Time: ");
        int waitingTime = scanner.nextInt();

        // Calculation of the fare.
        int baseFare = 3;
        double milesFare = 2 * miles;
        double waitingFee = 0.50 * (waitingTime - 5);

        if (waitingTime <= 5) {
            double fare = baseFare + milesFare;
            System.out.printf("Your total fare is: $%.2f, including the base fare of $%d.\n", fare, baseFare);
        }
        else {
            double extraFare = baseFare + milesFare + waitingFee;
            System.out.printf("Your total fare is: $%.2f\n", extraFare);
            System.out.printf("This includes a $%.2f waiting fee per minute over 5 min, as well as a base fare of $%d\n", waitingFee, baseFare);
        }


    }
}
