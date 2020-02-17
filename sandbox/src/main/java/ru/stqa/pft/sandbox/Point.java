package ru.stqa.pft.sandbox;

public class Point {
    public double x, y;
    public Point(double x, double y) {
        this.x=x;
        this.y=y;
    }
    public double distance(Point p1) {
        return Math.sqrt((FindDistance.square(p1.x-this.x)+FindDistance.square(p1.y-this.y)));
    }
}
