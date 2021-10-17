package com.company;

public class Square extends  Shape {
    private  double side;

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public Square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    public double getArea() {
        return side*side;
    }

    public double getPerimeter() {
        return side*4;
    }

}
