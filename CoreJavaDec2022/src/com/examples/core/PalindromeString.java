package com.examples.core;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        String s1 ="";
        String m =s;
        char ch;

        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            s1= ch+s1;
        }
        //System.out.println(s1);
        //System.out.println(m);
        if(s1.equals(m))
            System.out.println("The given string is a palindrome");
        else
            System.out.println("The given string is not a palindrome");


    }
}
