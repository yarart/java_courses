package ru.stqa.pft.sandbox;

public class FindDistance {
    public static void main(String[] args) {
        Point p1=new Point(1,3);
        Point p2=new Point(5,6);
        System.out.println("Расстояние между двумя  точками на плоскости = " + p1.distance(p2));
    }
    public static double square(double a) {
        return a*a;
    }
}
