package laba2.geometry3d;

import laba2.geometry2d.Circle;
import laba2.geometry2d.Rectangle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CyliderTest {
    Circle testBase1;
    Rectangle testBase2;
    Cylider test1;
    Cylider test2;
    @BeforeEach
    void setUp() {
        testBase1 = new Circle(17);
        testBase2 = new Rectangle(16,13);
        test1 = new Cylider(testBase1,5);
        test2 = new Cylider(testBase2,5);
    }

    @Test
    void volume() {
        assertEquals(4539.601384437252,test1.volume());
        assertEquals(1040.0,test2.volume());
    }
}