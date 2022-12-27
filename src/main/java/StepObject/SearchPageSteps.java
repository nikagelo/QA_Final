package StepObject;

import PageObject.searchPage;
import org.testng.Assert;

import static com.codeborne.selenide.Selectors.byClassName;
import static com.codeborne.selenide.Selenide.*;

public class SearchPageSteps extends searchPage {
    public SearchPageSteps clickMenu(){
        burgerMenu.click();
        return this;
    }
    public SearchPageSteps search(String searchItem){
        searchInput.setValue(searchItem).pressEnter();
        return this;
    }
    public SearchPageSteps prices(String min, String max){
        minValue.setValue(min);
        maxValue.setValue(max);
        float minF = Float.parseFloat(min);

        float maxF = Float.parseFloat(min);
        Assert.assertTrue(minF<=maxF);
        return this;
    }
    public SearchPageSteps filter(){
        filterButton.scrollIntoView(false);
        filterButton.click();
        return this;
    }
    public  SearchPageSteps minToMax(){
        sortBtn.click();
        minToMaxTxt.click();
        return this;
    }
    public  SearchPageSteps clickOnSeeAllBtn(){
        seeAll.scrollIntoView(false).click();
        return this;
    }
    public  SearchPageSteps maxToMin(){
        sortBtn.click();
        maxToMinTxt.click();
        return this;
    }
    public  SearchPageSteps clickOnBrand(){
        brand.click();
        bosch.click();
        return this;
    }
//    public  SearchPageSteps checkPrices(){
//       int count = $$(byClassName("product-item")).size();
//        System.out.println(count);
//        String firstPrice = $(byClassName("gramage-price-p"),0).getText();
//        System.out.println(firstPrice);
//        firstPrice.replaceAll("₾", "0");
//        System.out.println(firstPrice);
//
//        float firstPriceFloat = Float.parseFloat((firstPrice));
//        for (int i = 1; i<count; i++){
//            String secondPrice = $(byClassName("gramage-price-p"),i).getText();
//            System.out.println(secondPrice);
//            float secondPriceFloat = Float.parseFloat((secondPrice));
//            Assert.assertTrue(firstPriceFloat<=secondPriceFloat);
//            firstPrice = secondPrice;
//        }
//        return this;
//    }



}
