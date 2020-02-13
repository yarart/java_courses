public class FindDistance {
    public static void main(String[] args) {
        Point p1=new Point();
        Point p2=new Point();
        p1.x=1;
        p1.y=3;
        p2.x=5;
        p2.y=6;
        System.out.println("Расстояние между двумя  точками на плоскости = " + distance(p1,p2));
        System.out.println("Расстояние между двумя  точками на плоскости = " + Point.oneMoreDistance(p1,p2));
    }
    public static double square(double a) {
        return a*a;
    }
    public static double distance(Point p1, Point p2) {
        return Math.sqrt((square(p2.x-p1.x)+square(p2.y-p1.y)));
    }
}
