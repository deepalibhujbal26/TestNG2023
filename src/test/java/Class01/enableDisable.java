package Class01;

import org.testng.annotations.Test;

public class enableDisable {
    @Test
    public void Atest() {

        System.out.println("i am first test case");
    }

    @Test
    public void Btest() {

        System.out.println("i am the second test case");
    }


    //c test will not run bcoz we marked it as enable =false
    @Test(enabled = false)
    public void Ctest() {
        System.out.println("i am the third test case");
    }

}



