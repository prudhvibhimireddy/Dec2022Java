package com.examples.core;
public class DivBy235 {
    public static void main(String[] args){
        int[] a = {34, 67, 81, 97, 45, 54, 90, 83};
                int two=0; int three=0; int five=0;
                for(int i=0; i<8; i++) {
                    if (a[i] % 2 == 0)
                        two = two+1;
                    if (a[i] % 3 == 0)
                        three = three+1;
                    if (a[i] % 5 == 0)
                        five = five+1;
                }
                    System.out.println("Count of numbers divisible by 2 : " +two);
                    System.out.println("Count of numbers divisible by 3 : " +three);
                    System.out.println("Count of numbers divisible by 5 : " +five);




    }
}
