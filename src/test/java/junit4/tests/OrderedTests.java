package junit4.tests;


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//@FixMethodOrder(MethodSorters.JVM)
//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OrderedTests {

    @Test()
    public void testB() {
        System.out.println("Test1");
    }

    @Test()
    public void testA() {
        System.out.println("Test2");
    }

    @Test()
    public void testC() {
        System.out.println("Test3");
    }

}
