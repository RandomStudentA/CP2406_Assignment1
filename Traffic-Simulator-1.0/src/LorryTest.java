import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LorryTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Lorry lorry = new Lorry("0");

    @Test
    void getLength() {
        assertEquals(4, lorry.getLength());
    }

    @Test
    void getId() {
        assertEquals("lorry_0", lorry.getId());
    }

    @Test
    void testInheritance() {
        assertEquals(0, lorry.getSpeed());
        assertEquals(1, lorry.getPosition());
    }
}
