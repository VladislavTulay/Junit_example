package junit5;

import org.junit.jupiter.api.extension.*;

public class AnotherCondition implements BeforeEachCallback, BeforeAllCallback, AfterEachCallback, AfterAllCallback , BeforeTestExecutionCallback, AfterTestExecutionCallback {

    @Override
    public void beforeEach(ExtensionContext context) {
        System.out.println("Listening before callback " + context.getTestMethod());
    }

    @Override
    public void beforeAll(ExtensionContext context) {
        System.out.println("Listening before callback " + context.getTestClass());
    }

    @Override
    public void afterEach(ExtensionContext context) {
        System.out.println("Listening after callback " + context.getTestMethod());
    }

    @Override
    public void afterAll(ExtensionContext context) {
        System.out.println("Listening after callback " + context.getTestClass());
    }

    @Override
    public void afterTestExecution(ExtensionContext context) throws Exception {
        System.out.println("Listening after test execution callback " + context.getTestClass());
    }

    @Override
    public void beforeTestExecution(ExtensionContext context) throws Exception {
        System.out.println("Listening before test execution callback " + context.getTestClass());
    }
}
