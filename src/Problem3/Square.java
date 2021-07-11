package Problem3;

import Problem3.Parallelogram;

public class Square extends Parallelogram {
    public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4 ) {
        super( x1, y1, x2, y2, x3, y3, x4, y4);
    }

    public String toString(){
        return String.format("\n%s:\n%s%s: %s\n%s: %s\n", "Coordinates of Problem3.Square are", getCoordinatesAsString(), "Side is", getHeight(), "Area is", getArea() );

    }
}
