package junit4.tests;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class ConditionsTests {

    @Before
    public void testBeforeEachMethod() {
        System.out.println("I'm before every method");
    }

    @BeforeClass
    public static void testBeforeClass() {
        System.out.println("I'm before class");
    }

    @Test(expected = ArithmeticException.class)
    public void testExpectedException() {
        System.out.println("Test1");
    }

    @Test()
    public void testCalculation() {
        System.out.println("Test2");
    }

    @After
    public void testAfterEachMethod() {
        System.out.println("I'm after every method");
    }

    @AfterClass
    public static void testAfterClass() {
        System.out.println("I'm after class");
    }

}
