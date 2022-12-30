package com.examples.core;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        int m=n;
        int b=0,p=0;
        while(n>0) {
            b = n % 10;
            p = b + p * 10;
            n = n / 10;
        }
        //System.out.println(p);
        //System.out.println(m);
        if(m==p)
            System.out.println("The given number is a palindrome");
        else
            System.out.println("The given number is not a palindrome");

    }
}
