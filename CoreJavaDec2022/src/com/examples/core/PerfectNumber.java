package com.examples.core;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();

        int b = 0;
        for (int i=1; i < n; i++) {
            if (n % i == 0) {
                b = b + i;
            }
        }
        System.out.println("Sum of its divisors is " +b);
            if (b == n)
                System.out.println("The given number is a perfect number");
            else
                System.out.println("The given number is not a perfect number");
        }
    }


