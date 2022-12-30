package com.examples.core;

import java.util.Scanner;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String s1 = sc.nextLine();
        String s2 = "";
        int i;
        char ch;
        for(i=0;i<s1.length();i++) {
            ch = s1.charAt(i);
            while(s2.indexOf(ch)==-1){
                s2=s2+ch;
            }
        }
        System.out.println("Unique characters are " +s2);
    }
}

