package com.examples.core;

public class Arrayaverage {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6};
        float sum = 0;
        for(int i =0;i<a.length;i++) {
            sum = sum + a[i];
        }

        float average= (float) (sum/a.length);
        System.out.println("Average :" +average);
        }

    }

