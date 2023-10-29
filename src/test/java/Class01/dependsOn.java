package Class01;

import org.testng.annotations.Test;

public class dependsOn {

    @Test
    public void login(){
        System.out.println(8/0);
    }
    @Test(dependsOnMethods = {"login"})
    public void dashBoardVerification(){
        System.out.println("I am dashboard verification");
    }




}
