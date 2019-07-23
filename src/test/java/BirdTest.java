import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void shouldHeightIncreaseOneMeterWhenFlyGivenABird() {
        Bird bird = new Bird(10);
        int expectHeight = bird.getHeight() + 1;

        bird.fly();

        int actualHeight = bird.getHeight();
        assertEquals(expectHeight, actualHeight);
    }
}
