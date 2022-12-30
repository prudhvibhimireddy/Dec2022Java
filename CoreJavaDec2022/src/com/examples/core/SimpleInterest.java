package com.examples.core;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount");
        float p = sc.nextFloat();
        System.out.println("Enter rate of interest");
        float r = sc.nextFloat();
        System.out.println("Enter time period");
        float t = sc.nextFloat();

        float i,a;
        i = p*t*r/100;
        a = p+i;
        System.out.println("Simple interest is " +a);


    }
}
