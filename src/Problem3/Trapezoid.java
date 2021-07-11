package Problem3;

import Problem3.Quadrilateral;

public class Trapezoid extends Quadrilateral {
    private double height;


    public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public double getHeight() {
        if (getPoint1().getY() == getPoint2().getY() )
            return Math.abs( getPoint2().getY() - getPoint3().getY() );
        else
            return Math.abs( getPoint1().getY() - getPoint2().getY() );
    }
    public double getArea(){
        return getSumOfTwoSides() * getHeight() / 2.0;
    }

    public double getSumOfTwoSides() {
        if (getPoint1().getY() == getPoint2().getY() )
            return Math.abs(getPoint1().getX() - getPoint2().getX() ) + Math.abs( getPoint3().getX() - getPoint4().getX() );
        else
            return Math.abs(getPoint2().getX() - getPoint3().getX() ) + Math.abs( getPoint4().getX() - getPoint1().getX() );

    }
    public String toString(){
        return String.format("\n%s:\n%s%s: %s\n%s: %s\n", "Coordinates of Problem3.Trapezoid are", getCoordinatesAsString(), "Height is", getHeight(), "Area is", getArea() );
    }
}
