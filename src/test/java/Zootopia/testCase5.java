package Zootopia;

import StepObject.MainPageSteps;
import Utils.ChromeRunner;
import org.testng.annotations.Test;

public class testCase5 extends ChromeRunner {
    @Test
    public void case5() {
        MainPageSteps steps = new MainPageSteps();
        steps.goToCart()
                .isCartClear()
                .search()
                .addToCart()
                .checkCart()
                .removeItem()
                .isCartClear();
    }
}
