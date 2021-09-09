/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jazz Faye Olario
 */

import java.util.Scanner;   //using class scanner

public class App {
    public static void  main (String[] args){
        Scanner sc = new Scanner(System.in);    //Scanner to obtain input

        System.out.println("What is the order amount? ");
        String order = sc.nextLine();   //Read input from the user
        double O = Double.parseDouble(order);   //Convert from string to double

        System.out.println("What is the state? ");
        String state = sc.nextLine();   //Read input from the user

        double total = O;   //Formula to get the total
        //Using if statement--- if user input state wi or wisconsin
        if((state.equalsIgnoreCase("WI") || state.equalsIgnoreCase("Wisconsin"))){
            double tax = 5.5/100;   //Formula to prompt for the rate as a percentage
            double total_tax = tax * O; //Formula to obtain total tax

            System.out.printf("The subtotal is $%.2f.", O); //Display subtotal
            System.out.printf("\nThe tax is $%.2f.", total_tax);    //Display total tax
            System.out.printf("\nThe total is $%.2f.", (O + total_tax)); //Display to overall total
        }
        //Display overall total if user did not input state wi or wisconsin
        System.out.printf("\nThe total is $%.2f", total);
    }
}
