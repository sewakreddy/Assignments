package com.sewak;

import java.util.Scanner;

public class Swap {
    public void swapTwoNumbers(){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1= user_input.nextInt();
        int num2= user_input.nextInt();
        num1= num1-num2;
        num2=num1+num2;
        num1= num2-num1;
        System.out.println("After Swapping numbers are:"+num1 +"and"+num2);
    }
}
