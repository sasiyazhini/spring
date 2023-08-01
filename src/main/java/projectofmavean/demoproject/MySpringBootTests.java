package projectofmavean.demoproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MySpringBootTests {

    // This method will be executed once before any test method is run
    @BeforeClass
    public static void setUpBeforeClass() {
        // Setup tasks that should run before any test method
        System.out.println("Running setup before all test methods...");
    }

    // This method will be executed once after all test methods have been executed
    @AfterClass
    public static void tearDownAfterClass() {
        // Cleanup tasks that should run after all test methods have been executed
        System.out.println("Running cleanup after all test methods...");
    }

    // This method will be executed before each test method is run
    @Before
    public void setUp() {
        // Setup tasks that should run before each test method
        System.out.println("Running setup before each test method...");
    }

    // This method will be executed after each test method is run
    @After
    public void tearDown() {
        // Cleanup tasks that should run after each test method
        System.out.println("Running cleanup after each test method...");
    }

    // This is a sample test method
    @Test
    public void testMethod1() {
        // Test method 1
        System.out.println("Running Test Method 1...");
        // Add your test assertions here
    }

    // This is another test method
    @Test
    public void testMethod2() {
        // Test method 2
        System.out.println("Running Test Method 2...");
        // Add your test assertions here
    }

    // This is one more test method
    @Test
    public void testMethod3() {
        // Test method 3
        System.out.println("Running Test Method 3...");
        // Add your test assertions here
    }
}

