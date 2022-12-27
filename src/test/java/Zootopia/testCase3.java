package Zootopia;

import StepObject.RegPageSteps;
import StepObject.SearchPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static DataObject.RegPageData.*;
import static DataObject.SearchPageData.*;

public class testCase3 extends ChromeRunner {
    @Test
    public void case3() {
        SearchPageSteps steps = new SearchPageSteps();
        steps.clickMenu()
                .search(searchItem)
                .prices(min, max)
                .filter()
                .minToMax();
    }
}
