package com.examples.core;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character ");
        String s = sc.nextLine();

        if(s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u')
            System.out.println(s+ " is a vowel");
        else
            System.out.println(s+ " is not a vowel");
    }
}
