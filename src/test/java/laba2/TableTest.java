package laba2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {
    Table table;

    @BeforeEach
    void setUp() {
        table = new Table(2, 2);
        for (int i = 0; i < table.row(); i++) {
            for (int j = 0; j < table.col(); j++) {
                table.setValue(i, j, (i + 1) * 10 + j + 1);
            }
        }
    }

    @Test
    void getValue() {
        assertEquals(11, table.getValue(0, 0));
        assertEquals(21, table.getValue(1, 0));
    }

    @Test
    void toStringTest() {
        assertEquals("11\t12\t\n" + "21\t22\t\n", table.toString());
    }

    @Test
    void colTest() {
        assertEquals(2, table.col());
    }

    @Test
    void rowTest() {
        assertEquals(2, table.row());
    }

    @Test
    void avgTest() {
        assertEquals(16.5, table.average());
    }
}