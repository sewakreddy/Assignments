package com.sewak;

import java.util.Scanner;

public class Average {
        public void average(){
            Scanner user_input = new Scanner(System.in);
            System.out.println("Enter three numbers");
            int num1 = user_input.nextInt();
            int num2= user_input.nextInt();
            int num3= user_input.nextInt();
            double average = (num1+num2+num3)/3;
            System.out.println("Average="+average);

        }

    }
