package com.examples.oops;

public class AdvancedCalculator extends Calculator {
    double angle;

    AdvancedCalculator(double first, double second, double angle) {
        super(first, second);
        this.angle = angle;
    }

    public double sin(){
        return Math.sin(angle);
    }
    public double cos(){
        return Math.cos(angle);
    }
    public double tan(){
        return Math.tan(angle);
    }

    public double div(double firstnumber,double secondnumber) {
        if (secondnumber == 0) {
            System.out.println("Division is not possible by zero");
            return 0;
        }
        return firstnumber / secondnumber;
    }
}




