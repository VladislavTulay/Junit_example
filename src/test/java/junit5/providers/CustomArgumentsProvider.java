package junit5.providers;

import com.it_academy.practice.junit_basics.Calculator;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public class CustomArgumentsProvider implements ArgumentsProvider {

    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
                Arguments.of(new Calculator(1, 2)),
                Arguments.of(new Calculator(1, 3)),
                Arguments.of(new Calculator(2, 0))
        );
    }
}