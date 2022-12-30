package com.examples.core;
import java.util.Scanner;
public class RemoveWhitespaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.print("String with no spaces: ");
        System.out.println(str.replaceAll(" ",""));
    }
}
