package Class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGAnnotations {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("I am Before Method");
    }

    @Test(groups = "regression")
    public void aTestCase() {

        System.out.println("I am the First Test Case");
    }

    @Test
    public void bTestCase() {
        System.out.println("I am the Second Test Case");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("I am the After Method");
    }

}
