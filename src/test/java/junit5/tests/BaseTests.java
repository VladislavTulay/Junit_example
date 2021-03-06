package junit5.tests;

import com.it_academy.practice.junit_basics.Calculator;
import junit5.AnotherCondition;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(AnotherCondition.class)
    public class BaseTests {

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

    @Test
    public void testException() {
        assertThrows(ArithmeticException.class, () -> new Calculator(1 ,0).calculate('/'));
    }

    @Test
    public void testTimeout() {
        assertTimeout(Duration.ofMillis(1), () -> {
            Thread.sleep(40);
            System.out.println(123);
        });
    }

    @Test
    public void testTimeoutPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(1), () -> {
            Thread.sleep(40);
            System.out.println("123");
        });
    }

    @Test
    public void testAllAssertions() {
        assertAll(
                () -> assertThrows(ArithmeticException.class, () -> { float a = 5 / 0; } ),
                () -> assertTrue("".isEmpty()),
                () -> assertFalse("".isEmpty())
        );
    }
}
