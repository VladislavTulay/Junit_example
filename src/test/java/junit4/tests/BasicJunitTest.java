package junit4.tests;

import junit4.runners.ExampleRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(ExampleRunner.class)
public class BasicJunitTest {

    @Test
    public void testAssertTrueExample() {
        assertTrue(5 > 3);
    }

    @Test
    public void testAssertFalseExample() {
        assertFalse(5 > 3);
    }

    @Test
    public void testComparingStrings() {
        assertEquals("a", "c");
    }

    @Test(expected = ArithmeticException.class)
    public void testExpectedException() {
        double a = 5 / 0;
        assertEquals(0, a, 0);
    }

    @Test(timeout = 1)
    public void testWithoutExpectedException() throws InterruptedException {
        Thread.sleep(40);
        double a = 5 / 0;
        assertEquals(0, a, 0);
    }
}
