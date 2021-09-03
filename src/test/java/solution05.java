/*
 *  UCF COP3330 Fall 2021 Assignment 05 Solution
 *  Copyright 2021 Michael Andrich
 */


/*
    prompt user for two numbers
    switch first input from string to int
    switch second input from string to int
    do addition, print output
    do subtraction, print output
    do multiplication, print output
    do division, print output
 */

import java.util.Scanner;

public class solution05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is the first number? ");

        String num1 = sc.nextLine();
        int x = Integer.parseInt(""+num1);

        System.out.println("What is the second number? ");

        String num2 = sc.nextLine();
        int y = Integer.parseInt(""+num2+"");

        System.out.println(""+num1+ " + "+num2+" = "+(x + y) );

        System.out.println(""+num1+ " - "+num2+" = "+(x - y) );

        System.out.println(""+num1+ " * "+num2+" = "+(x * y) );

        System.out.println(""+num1+ " / "+num2+" = "+(x / y) );
    }
}