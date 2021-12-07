package junit5.tests;

import com.it_academy.practice.junit_basics.Calculator;
import enums.Months;
import junit5.providers.CustomArgumentsProvider;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTests {

    @ParameterizedTest
    @EmptySource
    public void testStringIsEmpty(String a) {
        assertTrue(a.isEmpty());
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testStringIsEmptyAndNull(String a) {
        assertTrue(a.isEmpty());
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    void testParameterizedPrimitives(int number) {
        assertTrue(isOdd(number));
    }

    @ParameterizedTest
    @EnumSource(value = Months.class)
    void testParameterizedEnum(Months month) {
        assertTrue(month.getNumber() >= 1 && month.getNumber() <= 12);
    }

    @ParameterizedTest
    @EnumSource(value = Months.class, names = {"APRIL", "MAY"})
    void testParameterizedCustomNamesEnum(Months month) {
        assertTrue(month.getNumber() >= 1 && month.getNumber() <= 12);
    }

    @ParameterizedTest
    @EnumSource(value = Months.class, names = {"APRIL", "MAY"})
    void testParameterizedExcludeCustomNamesEnum(Months month) {
        assertTrue(month.getNumber() >= 1 && month.getNumber() <= 12);
    }

    @ParameterizedTest
    @ArgumentsSource(CustomArgumentsProvider.class)
    void testParameterizedCustomProvider(Calculator calculator) {
        assertEquals(0, calculator.calculate('/'));
    }

    private boolean isOdd(Number num) {
        return num.intValue() % 2 != 0;
    }

}
