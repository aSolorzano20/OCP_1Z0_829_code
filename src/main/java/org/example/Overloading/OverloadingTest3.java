package org.example.Overloading;

class Point { int x, y; }
class ColoredPoint extends Point { int color; }

public class OverloadingTest3 {

    static void OverloadingTest3(ColoredPoint p, Point q)
    {
        System.out.println("(ColoredPoint, Point)");
    }
    static void OverloadingTest3(Point p, ColoredPoint q)
    {
        System.out.println("(Point, ColoredPoint)");
    }
    public static void main(String[] args)
    {
        ColoredPoint cp = new ColoredPoint();
        //OverloadingTest3(cp, cp);
    }
}
