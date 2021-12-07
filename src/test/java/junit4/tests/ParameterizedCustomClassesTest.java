package junit4.tests;

import com.it_academy.practice.junit_basics.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedCustomClassesTest {

    private Calculator calculator;

    public ParameterizedCustomClassesTest(Calculator calculator) {
        this.calculator = calculator;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        Object[][] data = new Object[][] {{new Calculator(1,2)}, {new Calculator(1, 0)}, {new Calculator(0, 2)}};
        return Arrays.asList(data);
    }

    @Test
    public void testComparingMonths() {
        assertEquals(0f, calculator.calculate('/'), 0);
    }

}
