package com.sewak;

import java.util.Scanner;

    public class AddBinaryNumbers {
        public void sumOfBinaryNumbers(){
            Scanner user_input= new Scanner(System.in);
            System.out.println("Enter two Binary numbers");
            String num1 = user_input.next();
            String num2 = user_input.next();
            Integer int_num1 = Integer.parseInt(num1,2);
            Integer int_num2 = Integer.parseInt(num2,2);
            Integer sum = int_num1 + int_num2;
            System.out.println("Sum of given binary numbers="+ Integer.toBinaryString(sum));
        }
    }

