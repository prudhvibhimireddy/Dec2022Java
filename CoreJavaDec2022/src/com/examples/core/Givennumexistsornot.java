package com.examples.core;

public class GivenNumExistsOrNot {
        public static void main(String[] args) {
            int[] a = {34, 67, 81, 97, 45, 54, 90, 83};
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 54) {
                    System.out.println("Given number exists in the Arraylist at " +i);
                    i--;
                }
                else
                    System.out.println("Given number does not exist in the Arraylist");
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 40) {
                    System.out.println("Given number exists in the Arraylist at " +i);
                    i--;
                }
                else
                    System.out.println("Given number does not exist in the Arraylist");

            }
        }
    }


