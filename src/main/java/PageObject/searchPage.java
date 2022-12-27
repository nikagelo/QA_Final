package PageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class searchPage {

    public  SelenideElement burgerMenu = $(byClassName("burger")),
    searchInput = $(byClassName("srch-inp")),
//    searchBtn = $(byId("search")),
    minValue = $(byName("min")),
    maxValue = $(byName("max")),
    filterButton = $(byClassName("filter-button")),
    sortBtn = $(byClassName("main-filter__selected")),
    minToMaxTxt = $(byText("ფასი: ზრდადობით")),
    maxToMinTxt = $(byText("ფასი: კლებადობით")),
    seeAll = $(byClassName("yvelas")),
    brand = $(byText("ბრენდი")),
    bosch = $(byText("Bosch"));
//    public ElementsCollection pricesWrapper = $$(byClassName("gramage-price-p"));


}
