package com.examples.core;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a =0;
        while(n>0){
            int k = n%10;
            a = k+a*10;
            n=n/10;
        }
        System.out.println("Reverse of a number is " +a);
    }
}
