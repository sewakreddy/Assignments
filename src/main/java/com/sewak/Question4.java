package com.sewak;

import java.util.Scanner;

public class Question4 {
    public void questionFour(){
        Scanner user_input= new Scanner(System.in);
        System.out.println("Enter numbers for this operation: a + b * c");
        int num1 = user_input.nextInt();
        int num2 = user_input.nextInt();
        int num3 = user_input.nextInt();
        int output= num1 + num2 * num3;
        System.out.println("result:"+output);
        System.out.println("Enter numbers for this operation:(a+b)%c");
        int num4 = user_input.nextInt();
        int num5 = user_input.nextInt();
        int num6 = user_input.nextInt();
        output = (num4+num5)%num6;
        System.out.println("result:"+output);
        System.out.println("Enter numbers for this operation:a+b*c/d");
        int num7 = user_input.nextInt();
        int num8 = user_input.nextInt();
        int num9 = user_input.nextInt();
        int num10 = user_input.nextInt();
        output = num7+num8*num9/num10;
        System.out.println("result:"+output);
        System.out.println("Enter numbers for this operation:a+b/c*d-e%f");
        int[] array = new int[6];
        for (int i = 0; i < 6; i++) {
            array[i] = user_input.nextInt();
        }
        output = array[0]+array[1]/array[2]*array[3]-array[4]%array[5];
        System.out.println("result:"+ output);










    }
}
