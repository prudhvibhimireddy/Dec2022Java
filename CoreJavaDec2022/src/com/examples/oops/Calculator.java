package com.examples.oops;

public class Calculator {
         private double firstnumber;
         private double secondnumber;

         Calculator(double firstnumber, double secondnumber){
             setFirstnumber(firstnumber);
             setSecondnumber(secondnumber);
         }

    public double getFirstnumber() {
        return firstnumber;
    }

    public void setFirstnumber(double firstnumber) {
        this.firstnumber = firstnumber;
    }

    public double getSecondnumber() {
        return secondnumber;
    }

    public void setSecondnumber(double secondnumber) {
             if(secondnumber!=0)
                this.secondnumber = secondnumber;
             else
                 this.secondnumber=1;
    }

    public double add(){
             return firstnumber+secondnumber;
         }
         public double add(double thirdnumber,double fourthnumber){
             return firstnumber+secondnumber+thirdnumber+fourthnumber;
         }
         public double sub(){
            return firstnumber-secondnumber;
         }
         public double mul(){
            return firstnumber*secondnumber;
        }
        public double div(){
            return firstnumber/secondnumber;
        }
}
