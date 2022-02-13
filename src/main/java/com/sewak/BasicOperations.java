package com.sewak;

import java.util.Scanner;

public class BasicOperations {
    public void basicOperationsOfTwoNumbers() {
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        int num1 = user_input.nextInt();
        int num2 = user_input.nextInt();
        int product = num1 * num2;
        int sum = num1 + num2;
        int quotient = num1 / num2;
        int difference = num1 - num2;
        int remainder = num1 % num2;
        System.out.println(" Sum of given numbers=" + sum);
        System.out.println(" Differene of given numbers=" + difference);
        System.out.println(" Product of given numbers=" + product);
        System.out.println(" Quotient of given numbers=" + quotient);
        System.out.println(" Remainder of given numbers=" + remainder);
    }
}
