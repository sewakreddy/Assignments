package com.sewak;

import java.util.Scanner;

public class QuestionNine {
    public void questionNineMethod() {
        Scanner user_input = new Scanner(System.in);
        double[] input = new double[10];
        System.out.println("Enter numbers for this operation: ((a * b -c * d)/(e - f))");
        for (int i = 0; i < 6; i++) {
            input[i] = user_input.nextDouble();
        }
        double result = ((input[0]*input[1]-input[2]*input[3])/(input[4]-input[5]));
        System.out.println("(("+input[0]+"*"+input [1]+"-"+input[2]+"*"+input[3]+")/("+input[4]+"-"+input[5]+")="+result);

      /* double num1= user_input.nextDouble();
        double num2= user_input.nextDouble();
        double num3= user_input.nextDouble();
        double num4= user_input.nextDouble();
        double num5= user_input.nextDouble();
        double num6= user_input.nextDouble();
        double result = ((num1*num2-num3*num4)/(num5-num6));
        System.out.println("Result="+result);*/
    }

}
