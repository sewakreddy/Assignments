package com.sewak;

import java.util.Scanner;

import static java.lang.Math.PI;

public class CIrcle {
    public void circleAreaPerimeter(){
        System.out.println("Enter radius of circle");
        Scanner user_input = new Scanner(System.in);
        double radius = user_input.nextDouble();

        double area, perimeter;
        area = (PI * radius * radius);
        perimeter = (2 * PI * radius);

        System.out.println("Area="+ area+"\nPerimeter="+ perimeter);
    }
}
