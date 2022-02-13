package com.sewak;

import java.util.ArrayList;

public class AmericaFlag {

    public void USA() {
        //Bottom Part of the flag
        ArrayList<String> B1 = new ArrayList<String>();
        ArrayList<String> B2 = new ArrayList<String>();
        ArrayList<String> B3 = new ArrayList<String>();
        ArrayList<String> B4 = new ArrayList<String>();
        ArrayList<String> B5 = new ArrayList<String>();

        for (int i = 1; i <= 40; i++)
            B1.add("=");
        B2=B1;
        B3=B1;
        B4=B1;
        B5=B1;

        //Top part of the flag
        ArrayList<String> A1 = new ArrayList<String>();
        ArrayList<String> A2 = new ArrayList<String>();
        ArrayList<String> A3 = new ArrayList<String>();
        ArrayList<String> A4 = new ArrayList<String>();
        ArrayList<String> A5 = new ArrayList<String>();
        ArrayList<String> A6 = new ArrayList<String>();
        ArrayList<String> A7 = new ArrayList<String>();
        ArrayList<String> A8 = new ArrayList<String>();
        ArrayList<String> A9 = new ArrayList<String>();

        for (int i = 0; i <=11 ; i++)
        {
            if(i%2==0) A1.add("*");
            else
                A1.add(" ");
        }
        for (int i = 12; i <=35 ; i++)
            A1.add("=");
        A3=A1;
        A5=A1;
        A7=A1;
        A9=A1;

        for (int i = 0; i <=11 ; i++)
        {
            if(i%2==0) A2.add(" ");
            else
                A2.add("*");
        }
        for (int i = 12; i <=35 ; i++)
            A2.add("=");
        A4=A2;
        A6=A2;
        A8=A2;


        ArrayList<ArrayList<String>> Flag= new ArrayList<ArrayList<String>>();
        Flag.add(0, A1);
        Flag.add(1, A2);
        Flag.add(2, A3);
        Flag.add(3, A4);
        Flag.add(4, A5);
        Flag.add(5, A6);
        Flag.add(6, A7);
        Flag.add(7, A8);
        Flag.add(8, A9);
        Flag.add(9, B1);
        Flag.add(10, B2);
        Flag.add(11, B3);
        Flag.add(12, B4);
        Flag.add(13, B5);


        for (int i = 0; i < Flag.size(); i++)
        {
            for (int j = 0; j < Flag.get(i).size(); j++) {
                System.out.print(Flag.get(i).get(j));
            }
            System.out.println();
        }
        
    }
}
