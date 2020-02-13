public class Point {
    public double x, y;
    public static double oneMoreDistance(Point p1, Point p2) {
        return Math.sqrt((FindDistance.square(p2.x-p1.x)+FindDistance.square(p2.y-p1.y)));
    }
}
