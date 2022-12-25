package com.examples.core;

import java.util.Scanner;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        int f=0;
        while(n>0) {
            int s = n % 10;
            sum = sum + s;
            n = n / 10;
        }
        System.out.println("The sum of the digits of the given number is "+sum);

        if(sum>9) {
            while (sum >0) {
                int d = sum % 10;
                f = d + f;
                sum = sum / 10;
            }
            System.out.println("sum of digits of the number until it is a single digit is " +f);
        }
    }
}
