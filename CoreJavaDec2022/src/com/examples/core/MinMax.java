package com.examples.core;
import java.util.*;
public class MinMax {
    public static void main(String[] args)
    {
        int[] a = {1, 15, -1, 23, 45, 70, 99, -13, -5};

        int min = 0;
        int max = 0;

        for(int i=0;i<a.length;i++){
           if(a[i]>max){
               max = a[i]+max;
               i--;
           }
           if(a[i]<min){
               min = a[i]+min;
               i--;
           }
        }
        System.out.println("max value is " +max);
        System.out.println("min value is " +min);
    }
}
