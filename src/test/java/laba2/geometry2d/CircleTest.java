package laba2.geometry2d;

import laba2.exception.IllegalFigureArgumentException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle test;

    @BeforeEach
    void setUp() {

        test = new Circle(12.0);
    }

    @Test
    void area() {
        assertEquals(452.3893421169302, test.area());
    }

    @Test
    void perimeter() {
        assertEquals(75.39822368615503, test.perimeter());
    }

    @Test
    void testToString() {
        assertEquals("Circle{radius=12.0}", test.toString());
    }
}