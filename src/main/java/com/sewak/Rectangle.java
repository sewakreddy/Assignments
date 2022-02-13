package com.sewak;

import java.util.Scanner;

public class Rectangle {
    public void rectangleAreaPerimeter() {
        System.out.println("Enter length and height of rectangle");
        Scanner user_input = new Scanner(System.in);
        double length = user_input.nextDouble();
        double height = user_input.nextDouble();
        double area, perimeter;
        area = (length * height);
        perimeter = (2 * (length + height));

        System.out.println("Area is"+length+"*"+height+"="+ area +"\nPerimeter="+"2*("+length+"+"+height+")="+perimeter);
    }
}
