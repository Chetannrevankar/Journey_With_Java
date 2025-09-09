import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

    @BeforeTest
    public void setup() {
        System.out.println("Browser Launch - Before Test");
    }

    @Test
    public void runTest() {
        System.out.println("Running Actual Test");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("Browser Close - After Test");
    }
}
