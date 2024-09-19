import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class z3Test {

    @Test
    void z__3() {
        assertEquals( "Net",z3.z__3(0,0,0));
        assertEquals( "x1 = -3.0x2 = -1.0",z3.z__3(1,4,3));
        assertEquals( "x0 = 1.0",z3.z__3(0,1,-1));
        assertEquals( "Вещественных корней нет",z3.z__3(17,16,13));
    }
}