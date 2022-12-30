package com.examples.core;

import java.util.Scanner;

 public class ArrayPosition {
    public static void main(String[] args) {
        int[] a = {34, 67, 81, 97, 45, 54, 90, 83};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = 8, count =1011;
        for (int i = l - 1; i >= 0; i--) {
            if (a[i] == n) {
                count = i;
            }
        }
        if(count != 1011){
            System.out.println("Number exists at "+count);
         }
         else if(count == 1011){
            System.out.println("Doesn't exist");
         }
    }
 }



