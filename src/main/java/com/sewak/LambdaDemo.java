package com.sewak;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LambdaDemo {

    /*List<Integer> list1 = new ArrayList<Integer>(5);
    List<Integer> list3 = Arrays.asList(5,6,7,8);
    int[] list4 = new int[10];//just an array
    ArrayList<Integer> A = new ArrayList<Integer>();
    ArrayList<int[]> B = new ArrayList<int[]>();
    ArrayList<Integer> C = new ArrayList<>(Arrays.asList(1,2,3,4));
    List list5= new ArrayList();*/


    public void array() {
        List<Integer> values = new ArrayList<>();
        Scanner user_input = new Scanner(System.in);
        System.out.println("enter array elements");
        while (user_input.hasNextInt()) {
            values.add(user_input.nextInt());
        }
        for (int i : values) {
            System.out.println("Array Elements are:"+i);
        }
        values.forEach(i->System.out.println("Using Lambda..elements are"+i));
        values.forEach(System.out::println);
    }
}


