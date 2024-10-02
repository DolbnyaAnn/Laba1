package laba2.geometry2d;

import laba2.exception.IllegalFigureArgumentException;

public class Circle implements laba2.geometry2d.Figure{
    double radius;

    public Circle(double radius) throws IllegalFigureArgumentException {
        if (radius<=0)
        {
            throw new IllegalFigureArgumentException("Radius must be more than 0");
        }

        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {

        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
