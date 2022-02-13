package com.sewak;

import java.util.Scanner;

public class Conversions {
    public void coversionsOfDecimalNumbers(){
        Scanner user_input= new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int input = user_input.nextInt();
        String binary_output = Integer.toBinaryString(input);
        String hexa_output = Integer.toHexString(input);
        String octa_output = Integer.toOctalString(input);
        System.out.println("Binary number:"+binary_output+"\nHexadecimal number:"+hexa_output+"\nOctal number:"+octa_output);

    }
}
