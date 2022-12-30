package com.examples.oops;


import java.util.Scanner;
class Rectangle implements RectangleInterface {

    Scanner sc = new Scanner(System.in);
    int l= sc.nextInt();
    int b = sc.nextInt();


    @Override
    public void getArea() {
        System.out.println("Area of the Rectangle is " + (l * b));
    }

    @Override
    public void getPerimeter() {
        System.out.println("Perimeter of the Rectangle is " + 2 * (l + b));
    }

    @Override
    public void getDiameter() {
        System.out.println("Diameter of the Rectangle is " + Math.sqrt((l * l) + (b * b)));
    }
}
class Square implements SquareInterface {

    Scanner sc = new Scanner(System.in);

    int s = sc.nextInt();
        @Override
        public void Area() {
            System.out.println("Area of the Square is " + (Math.pow(s, 2)));
        }

        @Override
        public void Perimeter() {
            System.out.println("Perimeter of the Square is " + (4 * s));
        }

        @Override
        public void Diameter() {
            System.out.println("Diameter of the Square is " + (s * (Math.sqrt(2))));
        }
    }



