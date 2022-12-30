package com.examples.core;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s1 = sc.nextLine();
        String s2= "";
        char ch;
        for(int i=0;i<s1.length();i++){
            ch=s1.charAt(i);
            s2=ch+s2;
        }
        System.out.println("Reverse of a string is " +s2);

    }
}
