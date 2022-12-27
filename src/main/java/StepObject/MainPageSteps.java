package StepObject;

import PageObject.MainPage;
import PageObject.searchPage;
import com.codeborne.selenide.Condition;

import static DataObject.SearchPageData.searchItem;
import static com.codeborne.selenide.Selenide.sleep;

public class MainPageSteps extends MainPage {

    public  MainPageSteps goToCart(){
        sleep(10000);
        cart.click();
        return this;
    }
    public MainPageSteps isCartClear(){
        cartIsEmptyTxt.shouldBe(Condition.visible);
        return this;
    }
    public MainPageSteps  search(){
        searchInput.setValue(searchItem).pressEnter();
        return this;
    }
    public MainPageSteps addToCart(){
        addToCart.click();
        return this;

    }
    public MainPageSteps checkCart(){
        cart.click();
        cartIsEmptyTxt.shouldNotBe(Condition.visible);
        return this;
    }
    public  MainPageSteps removeItem(){
        clearCart.click();
        return this;
    }
    public  MainPageSteps scrollToBottom(){
        authorisation.scrollIntoView(false).click();
        return this;
    }
    public MainPageSteps checkAuthorisationModal(){
        authorisationTxt.shouldBe(Condition.visible);
        return this;

    }
    public  MainPageSteps checkAuthorisation(){
        emailInput.pressEnter();
        return this;
    }
    public  MainPageSteps clickOnRecoveryBtn (){
        recoveryBtn.click();
        return this;
    }
    public  MainPageSteps fillEmailInput(String wrongEmail){
        resetEmailInput.setValue(wrongEmail).pressEnter();
        return this;
    }
    public  MainPageSteps wrongEmail(){
        wrongEmailTxt.shouldBe(Condition.visible);
        return this;
    }
}
