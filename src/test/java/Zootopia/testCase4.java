package Zootopia;

import StepObject.RegPageSteps;
import StepObject.SearchPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.RegPageData.*;
import static DataObject.SearchPageData.*;

public class testCase4 extends ChromeRunner {
    @Test
    public void case4() {
        SearchPageSteps steps = new SearchPageSteps();
        steps.clickOnSeeAllBtn()
                .clickOnBrand()
                .filter()
                .maxToMin();
//                .checkPrices();
    }
}
