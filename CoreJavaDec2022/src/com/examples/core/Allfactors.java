package com.examples.core;

import java.util.Scanner;

public class AllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        System.out.print("Factors of "+n+" are: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count += 1;
                System.out.print(i + " ");
            }
        }
        System.out.println();
        if (count == 2) {
            System.out.println(n + " is a prime number");
        }
        if (count!=2){
            System.out.println(n+" is not a prime number");
        }
    }
}

