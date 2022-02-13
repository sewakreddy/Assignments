package com.sewak;

import java.util.Scanner;

public class Product {
    public void productOfTwoNumbers() {
        Scanner user_input = new Scanner(System.in);
        int product;
        System.out.println("Enter two integer numbers");
        int num1 = user_input.nextInt();
        int num2 = user_input.nextInt();
        product = num1 * num2;
        System.out.println(" Product of given numbers=" + product);
    }
}
