package com.sewak;

import java.util.Scanner;

public class Sum {
    public void sumOfTwoNumbers(){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter two integer numbers");
        int num1 = user_input.nextInt();
        int num2 = user_input.nextInt();
        System.out.println(" Sum of given numbers="+(num1+num2));
    }
}
