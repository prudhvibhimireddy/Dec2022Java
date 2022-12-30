package com.examples.oops;

public class Test {
    public static void main(String[] args) {

        AdvancedCalculator calc = new AdvancedCalculator(92,18,60);

        Calculator cal = new Calculator(19,0);
        //calc.firstnumber = 24;
        //calc.secondnumber = 3;
        //calc.angle=56;

        System.out.println("1. CAL ADD RESULT " + cal.add());

        System.out.println("1. ADD RESULT OF FOUR NUMBERS " + calc.add(25,41));

        System.out.println("1. ADD RESULT " + calc.add());
        System.out.println("2. SUB RESULT " + calc.sub());
        System.out.println("3. MULTIPLY RESULT " + calc.mul());
        System.out.println("4. DIVIDE RESULT " + calc.div());

        System.out.println("4. DIVIDE RESULT " + calc.div(24,0));

        System.out.println("SIN VALUE " +calc.sin());
        System.out.println("COS VALUE " +calc.cos());
        System.out.println("TAN VALUE " +calc.tan());


    }
}
