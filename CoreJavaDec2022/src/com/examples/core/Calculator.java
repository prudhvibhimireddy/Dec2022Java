package com.examples.core;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MUL");
        System.out.println("4. DIV");
        System.out.println("Enter choice number ");
        int c = sc.nextInt();
        System.out.println("Enter first number ");
        int a = sc.nextInt();
        System.out.println("Enter second number ");
        int b = sc.nextInt();

        if(c==1)
            add(a,b);
        else if(c==2)
            sub(a,b);
        else if(c==3)
            mul(a,b);
        else if(c==4)
            div(a,b);
    }

    public static void add(int a,int b) {
        System.out.println(a+b);
    }
    public static void sub(int a,int b) {
        System.out.println(a-b);
    }
    public static void mul(int a,int b) {
        System.out.println(a * b);
    }
    public static void div(float a,float b) {
        System.out.println(a/b);
    }

    }
