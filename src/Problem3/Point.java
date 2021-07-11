package Problem3;

public class Point {
    private double x;
    private double y;
    public Point( double xCoordinate, double yCoordinate){
        x = xCoordinate;
        y = yCoordinate;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String toString() {
        return "Problem3.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
