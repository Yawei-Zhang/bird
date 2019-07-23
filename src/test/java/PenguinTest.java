import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PenguinTest {
    @Test
    public void shouldPositionXPlus1MeterWhenFlyGivenAPenguin() {
        Penguin penguin = new Penguin(0);
        int initPositionX = penguin.getPositionX();

        penguin.fly();

        assertEquals(initPositionX + 1, penguin.getPositionX());
    }
}
