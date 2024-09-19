import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class z1Test {

    @Test
    void z__1() {
        assertEquals("fizz",z1.z__1(5));
        assertEquals("buzz",z1.z__1(7));
        assertEquals("fizzbuzz",z1.z__1(35));
    }
}