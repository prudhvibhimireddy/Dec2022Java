package com.examples.core;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int a = n, product = 0;
        while (a > 0) {
            int b = a % 10;
            product = product + b * b * b;
            a = a / 10;
        }
        System.out.println("The product of the number is "+product);
        if (n == product)
            System.out.println(n + " is an armstrong number");
        else
            System.out.println(n + " is not an armstrong number");
    }
}




