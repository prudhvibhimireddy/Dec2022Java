package com.examples.core;

import java.util.Scanner;

public class fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = 1, b = 2, c=0;
        System.out.print(a+",");
        System.out.print(b+",");
        while (c < n) {
            c = a + b;
            a = b;
            b = c;
            if(c <=n) {
                System.out.print("");
                System.out.print(c + ",");
            }

        }
    }
}
