package junit5.tests;

import org.junit.jupiter.api.*;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//@TestMethodOrder(MethodOrderer.MethodName.class)
//@TestMethodOrder(MethodOrderer.Random.class)
@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrderedTests {

    @Test()
    @DisplayName("asd")
    @Order(1)
    public void testExpectedException() {
        System.out.println("Test1");
    }

    @Test()
    @DisplayName("qwe")
    @Order(2)
    public void testCalculation() {
        System.out.println("Test2");
    }

    @Test()
    @DisplayName("fda")
    @Order(4)
    public void testzalculation() {
        System.out.println("Test4");
    }

    @Test()
    @DisplayName("hgf")
    @Order(3)
    public void testxalculation() {
        System.out.println("Test3");
    }

}
