package com.examples.core;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principal amount");
        float p = sc.nextFloat();
        System.out.println("Enter rate of interest");
        float r = sc.nextFloat();
        System.out.println("Enter time period");
        float t = sc.nextFloat();
        System.out.println("Enter number of times interest is applied per year");
        float n = sc.nextFloat();

        float i = (r/(n*100))+1;
        float c = n*t;
        double b =1;
        while(c>0){
            b = b*i;
            c--;
        }
        //float a = (float) Math.pow(i,c);
        double ci = b*p;
        System.out.println("Compound interest is " +ci);

    }
}
