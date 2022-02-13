package com.sewak;

import java.util.Scanner;

public class Division {
    public void divideTwoNumbers(){
        Scanner user_input = new Scanner(System.in);
        int quotient;
        System.out.println("Enter two integer numbers");
        int num1 = user_input.nextInt();
        int num2 = user_input.nextInt();
        quotient=num1/num2;
        System.out.println(" Quotient of given numbers="+quotient);
    }

}


