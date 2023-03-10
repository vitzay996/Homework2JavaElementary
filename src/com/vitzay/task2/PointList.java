package com.vitzay.task2;

public class PointList {
    private Point[] points = new Point[0];

    public void add(Point point) {
        Point[] tmp = new Point[points.length + 1];
        tmp[tmp.length - 1] = point;
        System.arraycopy(points, 0, tmp, 0, points.length);
        points = tmp;
    }

    public int size() {
        return points.length;
    }

    public Point get(int index) {
        return points[index];
    }
}
