package com.examples.core;

import java.util.Scanner;

public class ArrayReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in an array ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter " +n+ " numbers of the array");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number to be replaced ");
        int q = sc.nextInt();
        System.out.println("Enter number to replace");
        int w = sc.nextInt();

        for(int i=0;i<n;i++){
            if(a[i]==q){
                a[i]=w;
            }
        }
        System.out.println("Array after replacing ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]);
        }
    }
}
