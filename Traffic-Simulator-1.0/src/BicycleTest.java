import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BicycleTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Bicycle bicycle = new Bicycle("0");

    @Test
    void getLength() {
        assertEquals(0.25, bicycle.getLength());
    }

    @Test
    void getId() {
        assertEquals("bicycle_0", bicycle.getId());
    }

    @Test
    void testInheritance() {
        assertEquals(0, bicycle.getSpeed());
        assertEquals(1, bicycle.getPosition());
    }
}
