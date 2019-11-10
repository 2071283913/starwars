package starwars.problems;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DigitalRootsTest {

    @Test
    public void Tests() {
        assertEquals("Nope!", 7, DigitalRoots.digital_root(16));
        assertEquals("Nope!", 6, DigitalRoots.digital_root(456));
    }
}