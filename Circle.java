package com.company.java_core.homework2.task2;

public class Circle {
    private double radius;
    private double diameter;

    public Circle(double radius, double diameter){
        this.radius = radius;
        this.diameter = diameter;
    }

    public double Area(){
        double area = (Math.PI / 4) * (Math.pow(diameter, 2));
        return area;
    }

    public double Length(){
        double length = 2 * Math.PI * radius;
        return length;
    }
}
