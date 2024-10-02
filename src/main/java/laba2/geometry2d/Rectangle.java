package laba2.geometry2d;

import laba2.exception.IllegalFigureArgumentException;

public class Rectangle implements laba2.geometry2d.Figure{
    double a;
    double b;

    public Rectangle(double a, double b) throws IllegalFigureArgumentException {
        if (a<=0 || b<=0)
        {
            throw new IllegalFigureArgumentException("Sides must be more than 0");
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double area() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return 2*(a+b);
    }

    @Override
    public String toString() {

        return "Rectangle ["+a+"],["+b+"]";
    }
}
