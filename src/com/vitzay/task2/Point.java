package com.vitzay.task2;

public class Point {
    public static final Point ORIGIN = new Point(0, 0);
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distanceToOrigin() {
        return distanceTo(ORIGIN);
    }

    public double distanceTo(Point point) {
        double dx = point.x - x;
        double dy = point.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
