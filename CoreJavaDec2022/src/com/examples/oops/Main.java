package com.examples.oops;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter length and breadth of the Rectangle ");
        Rectangle r = new Rectangle();
            r.getArea();
            r.getPerimeter();
            r.getDiameter();
        System.out.println();
        System.out.println("Enter length of the Square's side");
        Square s = new Square();
            s.Area();
            s.Perimeter();
            s.Diameter();
        }
    }

