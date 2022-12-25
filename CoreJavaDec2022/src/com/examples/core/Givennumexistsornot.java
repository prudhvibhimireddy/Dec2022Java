package com.examples.core;

import java.util.ArrayList;

public class Givennumexistsornot {
        public static void main(String[] args)
        {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(34);
            arr.add(67);
            arr.add(81);
            arr.add(97);
            arr.add(45);
            arr.add(54);
            arr.add(90);
            arr.add(83);

            if (arr.contains(54))
                System.out.println("Given number exists in the Arraylist");
            else
                System.out.println("Given number does not exist in the Arraylist");
            if (arr.contains(40))
                System.out.println("Given number exists in the Arraylist");
            else
                System.out.println("Given number does not exist in the Arraylist");

        }
    }


