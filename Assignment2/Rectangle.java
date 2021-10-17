package com.company;

public class Rectangle extends Shape {

    private  double width;
    private  double height;

    public Rectangle(double side) {
        this.width=side;
        this.height=side;
    }


    public Rectangle(double width,double height) {
        this.width=width;
        this.height=height;
    }

    public Rectangle(String name, String color, double width, double height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width*height;
    }

    public double getPerimeter() {
        return (width+height)*2;
    }


}
