package Class01;

import org.testng.annotations.Test;

public class priority {

    // Default : priority will be it run alphabetical order of method name A/B/C
    //we can set  highest priority =0 , priority =1

    @Test(priority = 2,groups = "regression")
    public void Atest() {
        System.out.println("i am Atest");
    }

    @Test (priority = 1)
    public void Ctest() {

        System.out.println("i am the CTest");
    }

    //by default priority=0 it will run first
    @Test
    public void Btest()
    {
        System.out.println("i am the BTest");
    }
}
