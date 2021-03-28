import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruckTest {
    Road road = new Road("0", 1, 5, new int[]{0, 0});
    Truck truck = new Truck("0");

    @Test
    void getLength() {
        assertEquals(5, truck.getLength());
    }

    @Test
    void getId() {
        assertEquals("truck_0", truck.getId());
    }

    @Test
    void testInheritance() {
        assertEquals(0, truck.getSpeed());
        assertEquals(1, truck.getPosition());
    }
}
