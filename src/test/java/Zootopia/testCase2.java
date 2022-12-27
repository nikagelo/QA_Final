package Zootopia;

import StepObject.RegPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.RegPageData.*;

public class testCase2 extends ChromeRunner {
    @Test
    public void case2(){
        RegPageSteps steps = new RegPageSteps();
        steps.clickSignIn()
                .clickOnRegistrationLink()
                .checkNumbers(wrongPersNum)
                .clickOnRegBtn()
                .wrongReg();


    }
}
