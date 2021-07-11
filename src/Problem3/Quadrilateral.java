package Problem3;

import Problem3.Point;

public class Quadrilateral {
    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4){
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        point3 = new Point(x3, y3);
        point4 = new Point(x4, y4);

    }
    public Point getPoint1(){
        return point1;
    }
    public Point getPoint2(){
        return point2;
    }
    public Point getPoint3(){
        return point3;
    }
    public Point getPoint4(){
        return point4;
    }

    @Override
    public String toString() {
        return String.format("%s:\n%s", "Coordinates of Problem3.Quadrilateral are", getCoordinatesAsString() );
    }

    public String getCoordinatesAsString() {
        return String.format("%s, %s, %s, %s\n", point1, point2, point3, point4 );
    }
}
