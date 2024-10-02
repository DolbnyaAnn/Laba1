package laba2.geometry2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle test;
    @BeforeEach
    void setUp() {
        test = new Rectangle(4,3);
    }

    @Test
    void area() {
        assertEquals(12.0,test.area());
    }

    @Test
    void perimeter() {
        assertEquals(14.0,test.perimeter());
    }

    @Test
    void testToString() {
        assertEquals("Rectangle [4.0],[3.0]",test.toString());
    }
}