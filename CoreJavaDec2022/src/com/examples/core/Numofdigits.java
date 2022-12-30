package com.examples.core;

import java.util.Scanner;

public class NumOfDigits {
    public static void main(String[] args) {
        int m= 4536;
        int n=m, digits=0;
        while(n>0){
            if(n%10 >=0)
                digits+=1;
            n=n/10;
        }
        System.out.println(digits);

    }
}
