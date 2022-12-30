package com.examples.core;

import java.util.Scanner;

public class PrimeNum1to100 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i <= 100; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count += 1;
                }
            }
            if (count == 2) {
                System.out.print(i+" ");
                k+= 1;
            }
        }
        System.out.println();
        System.out.println("Number of prime numbers below 100 are : "+k);
    }
}


