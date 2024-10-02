package laba2.geometry3d;

import laba2.exception.IllegalCylinderHeightException;
import laba2.geometry2d.Figure;
import laba2.geometry2d.Rectangle;
import laba2.geometry2d.Circle;

public class Cylider {
    laba2.geometry2d.Figure base;
    double height;

    public Cylider(double height) throws IllegalCylinderHeightException {
        if (height<=0)
        {
            throw new IllegalCylinderHeightException("Height must be more than 0");
        }
        this.height = height;
    }

    public Cylider(Figure base, double height) {
        this(height);
        this.base = base;

    }

    public Cylider(double radius, double height) {
        this(height);
        this.base = new Circle(radius);

    }

    public Cylider(double a, double b, double height) {
        this(height);
        this.base = new Rectangle(a, b);
    }

    public double volume() {
        return this.base.area() * height;
    }
}
