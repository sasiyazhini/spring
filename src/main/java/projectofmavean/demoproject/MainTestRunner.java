package projectofmavean.demoproject;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MainTestRunner {

    public static void main(String[] args) {
        // Run the JUnit tests programmatically
        Result result = JUnitCore.runClasses(MySpringBootTests.class);

        // Check if there are any test failures
        if (result.wasSuccessful()) {
            System.out.println("All tests passed successfully!");
        } else {
            System.out.println("Test failures:");

            for (Failure failure : result.getFailures()) {
                System.out.println(failure.getTestHeader() + ": " + failure.getMessage());
            }
        }
    }
}
