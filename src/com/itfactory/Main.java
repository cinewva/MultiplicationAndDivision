package com.itfactory;

import java.util.Scanner;


/*
Problem 5.
Read two numbers from the keyboard and display the multiplication of the two numbers and the division (with a comma) of the two numbers.
 */
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        //read the first number
        System.out.print("enter one number: ");
        float nr1 = Float.parseFloat(scanner.nextLine());

        // ask the user for the second number
        System.out.print("enter another number: ");
        float nr2 = Float.parseFloat(scanner.nextLine());

       // show result of multiply and divide
        System.out.println("the result of the multiplication is: " + (int)(nr1 * nr2));
        System.out.println("the result of the division is: " + nr1 / nr2);


    }

}
