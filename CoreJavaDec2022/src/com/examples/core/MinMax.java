package com.examples.core;
import java.util.*;
public class MinMax {
    public static void main(String[] args)
    {
        ArrayList<Integer> arr = new ArrayList<>();
                arr.add(1);
                arr.add(15);
                arr.add(-1);
                arr.add(23);
                arr.add(45);
                arr.add(70);
                arr.add(99);
                arr.add(-13);
                arr.add(-5);

                int max = arr.get(0);
                int min = arr.get(0);

                int n = arr.size();
                for(int i =1; i < n; i++) {
                    if(arr.get(i) < min){
                        min = arr.get(i);
                    }
                }
                for(int i =1; i < n; i++){
                    if(arr.get(i) > max){
                        max = arr.get(i);
                    }
                }

                System.out.println("Maximum value is = " +max);
                System.out.println("Minimum value is = " +min);






    }
}
