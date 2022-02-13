package com.sewak;

import java.util.Scanner;

public class Table {
    public void multiplicationTable(){
        System.out.println("Enter a number");
        Scanner user_input = new Scanner(System.in);
        int number=user_input.nextInt();
        for (int i = 1; i <=10; i++) {
            System.out.println(number + "*" +i+ "=" + (number*i));
        }
    }
}
