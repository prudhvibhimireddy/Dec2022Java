package com.examples.core;

import java.util.Scanner;

public class StringMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string ");
        String s1=sc.nextLine();
        System.out.println("Enter 2nd string ");
        String s2=sc.nextLine();

        String s = s1.concat(s2);
        System.out.println("Strings after merging " +s);
    }
}
