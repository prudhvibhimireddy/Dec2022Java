package com.examples.core;

import java.util.Scanner;

public class AverageOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter " +n+ " numbers of the array");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int d=0;
        for(int i=0;i<n;i++){
            d = d+a[i];
        }
        float l =(float)d/n;
        System.out.println("Average is " +l);
    }
}
