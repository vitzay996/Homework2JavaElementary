package com.vitzay.task2;

public class Circle {

    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public boolean containsPoint(Point point) {
        double distance = center.distanceTo(point);
        return distance <= radius;
    }
}
