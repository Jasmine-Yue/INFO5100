package com.company;

public class ShapeTester {

    public static void main(String[] args) {
	// write your code here

        Shape shape1 = new Shape("Shape1", "pink");
        System.out.println("shape1");
        System.out.println(shape1.printShape());
        Shape shape2 = new Shape("Shape2", "orange", 20, 30);
        System.out.println("shape2");
        System.out.println("area : " + shape2.getArea() + " perimeter : " + shape2.getPerimeter());
        System.out.println(shape2.printShape());
        Rectangle rectangle1 = new Rectangle(2);
        System.out.println("rectangle1");
        System.out.println("area : " + rectangle1.getArea() + " perimeter : " + rectangle1.getPerimeter());
        Rectangle rectangle2 = new Rectangle("Rectangle", "Purple", 4, 7);
        System.out.println("rectangle2");
        System.out.println("area : " + rectangle2.getArea() + " perimeter : " + rectangle2.getPerimeter());
        System.out.println(rectangle2.printShape());
        Square square1 = new Square(3);
        System.out.println("square1");
        System.out.println("area : " + square1.getArea() + " perimeter : " + square1.getPerimeter());
        Square square2 = new Square("Square", "black", 7);
        System.out.println("square2");
        System.out.println("area : " + square2.getArea() + " perimeter : " + square2.getPerimeter());
        System.out.println(square2.printShape());

        Sum sum = new Sum();
        System.out.println(sum.add(2,3));//output : 5
        System.out.println(sum.add(4, 9, 12));//output : 25
        System.out.println(sum.add(4, 5.0));//output : 9.0
        System.out.println(sum.add(15.5, 5));//output : 20.5
        System.out.println(sum.add(1.0, 6.4));//output : 7.4


    }
}
