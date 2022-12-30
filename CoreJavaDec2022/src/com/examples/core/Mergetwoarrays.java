package com.examples.core;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] a = {1,3,5};
        int[] b = {2,4,7,9};

        int[] c = new int[a.length+b.length];
        for(int i=0;i<c.length;i++){
            if(i<a.length){
                c[i] = a[i];
            }
            else if(i>=a.length){
                c[i] = b[i-a.length];
            }
        }
        System.out.print("Arrays after merging : ");

        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}
