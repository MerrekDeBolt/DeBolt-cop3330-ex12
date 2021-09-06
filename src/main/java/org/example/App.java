package org.example;

/*
 *  UCF COP3330 Fall 2021 Exercise 12 Solution
 *  Copyright 2021 Merrek DeBolt
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args)
    {
        String input;
        double principal, rate, total;
        int years;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal: ");
        input = scanner.nextLine();
        principal = Double.parseDouble(input);

        System.out.println("Enter the rate of interest: ");
        input = scanner.nextLine();
        rate = Double.parseDouble(input);
        rate /= 100;

        System.out.println("Enter the number of years: ");
        input = scanner.nextLine();
        years = Integer.parseInt(input);

        total = principal + (principal * (rate * years));

        rate *= 100;
        System.out.println("After " + years + " years at " + String.format("%.2f", rate) + "%, the investment will be worth $" + String.format("%.2f", total) + ".");
    }
}
