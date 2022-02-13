package com.sewak;

import java.util.Scanner;

public class Face {
    public void face(){
        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter a character to view american flag");
        String character = user_input.next();
        System.out.println(" +\"\"\"\"\"+");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  |");
        System.out.println(" | '-' |");
        System.out.println(" +-----+");
    }
}
