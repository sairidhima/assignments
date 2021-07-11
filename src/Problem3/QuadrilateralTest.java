package Problem3;

import Problem3.*;

public class QuadrilateralTest {
    public static void main(String[] args){
        Quadrilateral quadrilateral = new Quadrilateral(1.1, 1.2, 6.6, 2.8, 6.2, 9.9, 2.2, 7.4);

        Trapezoid trapezoid = new Trapezoid(0.0, 0.0, 10.0, 0.0, 8.0, 5.0, 3.3, 5.0);

        Parallelogram parallelogram = new Parallelogram(5.0, 5.0, 11.0, 5.0, 12.0, 20.0, 6.0, 20.0);

        Rectangle rectangle = new Problem3.Rectangle(17.0, 14.0, 30.0, 14.0, 30.0,  28.0, 17.0, 28.0);

        Square square = new Square(4.0, 0.0, 8.0, 0.0, 8.0, 4.0, 4.0, 4.0);

        System.out.printf("%s %s %s %s %s\n", quadrilateral, trapezoid, parallelogram, rectangle, square);
    }
}
