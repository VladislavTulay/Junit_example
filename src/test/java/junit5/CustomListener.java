package junit5;

import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestPlan;

public class CustomListener implements TestExecutionListener {

    @Override
    public void testPlanExecutionStarted(TestPlan testPlan) {
        System.out.println("TestPlanExecutionStarted ");
        System.out.println(testPlan.getRoots());
    }

}
