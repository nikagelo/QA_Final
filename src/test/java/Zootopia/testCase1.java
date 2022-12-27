package Zootopia;

import StepObject.RegPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.RegPageData.*;

public class testCase1 extends ChromeRunner {
@Test
    public void case1(){
    RegPageSteps steps = new RegPageSteps();
    steps.clickSignIn()
            .clickOnRegistrationLink()
            .fillNames(nameAndLast)
            .fillPersonalNumber(personalNumber)
            .checkPersonalNumber(wrongPersNum)
            .fillPassword(regPassword)
            .fillPhoneNumber(phoneNum)
            .passwordConfirmation(regPassword)
            .choosepic()
            .clickOnRegBtn();
    }
}
