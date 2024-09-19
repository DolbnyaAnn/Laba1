import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class z5Test {

    @Test
    void z_5() {
        assertEquals(false,z5.z_5("namn"));
        assertEquals(true,z5.z_5("naan"));
        assertEquals(true,z5.z_5("naaan"));
        assertEquals(false,z5.z_5("namkkan"));
    }
}