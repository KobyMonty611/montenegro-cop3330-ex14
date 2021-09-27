/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Koby Montenegro
 */

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String output;
        System.out.print("What is the order amount? " );
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What is the state? " );
        String state = scanner.nextLine();

        double tax = (amount * 0.055);

        double total = amount;

        if(state.equals("WI"))
        {
            total = amount + tax;
            output = String.format("The subtotal is $" + amount + ".\nThe tax is $"+ tax + ".\nThe total is $" + total + ".");
        }
        else
        {
            output = ("The total is $" + total + ".");
        }

        System.out.print(output);

        scanner.close();
    }
}