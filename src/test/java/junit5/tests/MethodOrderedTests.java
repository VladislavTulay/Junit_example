package junit5.tests;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.DisplayName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
public class MethodOrderedTests {

    @Test()
    @DisplayName("1")
    public void testB() {
        System.out.println("Test1");
    }

    @Test()
    @DisplayName("2")
    public void testA() {
        System.out.println("Test2");
    }

    @Test()
    @DisplayName("5")
    public void testE() {
        System.out.println("Test5");
    }

    @Test()
    @DisplayName("3")
    public void testC() {
        System.out.println("Test3");
    }

    @Test()
    @DisplayName("4")
    public void testD() {
        System.out.println("Test4");
    }

    @Test()
    @DisplayName("6")
    public void testF() {
        System.out.println("Test6");
    }

}
