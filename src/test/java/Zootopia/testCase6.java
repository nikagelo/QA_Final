package Zootopia;

import StepObject.MainPageSteps;
import StepObject.RegPageSteps;
import StepObject.SearchPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.MainPageData.wrongEmailTxt;
import static DataObject.RegPageData.*;
import static DataObject.SearchPageData.*;

public class testCase6 extends ChromeRunner {
    @Test
    public void case6() {
        MainPageSteps steps = new MainPageSteps();
        steps.scrollToBottom()
                .checkAuthorisationModal()
                .checkAuthorisation()
                .clickOnRecoveryBtn()
                .fillEmailInput(wrongEmailTxt)
                .wrongEmail();
    }
}
