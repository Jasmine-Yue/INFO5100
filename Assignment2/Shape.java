package com.company;

public class Shape {

    private String name;
    private  String color;
    private  double area;
    private  double perimeter;

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }


    public Shape(){

    }

    public Shape(String name, String color) {
        this.name = name;
        this.color = color;

    }

    public Shape(String name, String color,  double perimeter,double area) {
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public  String printShape(){
        String str;
        str="The "+getName()+ " has a "+getColor()+" color. ";
        return  str;
    }

}
