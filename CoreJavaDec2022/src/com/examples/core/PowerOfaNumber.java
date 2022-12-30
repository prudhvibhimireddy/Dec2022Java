package com.examples.core;

import java.util.Scanner;

public class PowerOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number ");
        int n = sc.nextInt();
        System.out.println("Enter exponent number ");
        int n1 = sc.nextInt();

        int product =1;
        while(n1>0) {
            product = product * n;
            n1--;
        }
        System.out.println("Answer equals to "+product);
            }
        }


