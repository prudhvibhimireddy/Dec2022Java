package com.examples.core;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter array size for a:");
        int n1 = sc.nextInt();
        int[] a = new int[n1];

        System.out.println("enter "+n1+" elements for a");
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }


        System.out.println("enter array size for b:");
        int n2 = sc.nextInt();

        System.out.println("enter "+n2+" elements for b");
        int[] b = new int[n2];
        for(int i=0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        int l=0;
        if(a.length<b.length){
            l=a.length;
        }
        else
            l=b.length;
        int[] c = new int[l];

        int p=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    c[p]=a[i];
                    p++;
                }

            }
        }

        System.out.print("Common elements are: ");
        for(int i=0;i<c.length;i++){
            if(c[i]!=0){
                System.out.print(c[i]+" ");
            }
        }
    }
}
