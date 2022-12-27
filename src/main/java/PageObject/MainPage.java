package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
public class MainPage  extends RegPage{
    public  SelenideElement cart = $(byCssSelector(".icart")),
    cartIsEmptyTxt = $(byText("კალათა ცარიელია")),
    authorisation = $(byLinkText("ავტორიზაცია")),
    authorisationTxt = $(byText("\n" +
            "                            გაიარეთ რეგისტრაცია                        ")),
    emailInput = $(byName("login_email")),
    recoveryBtn = $(byClassName("recovery-btn")),
    resetEmailInput = $(byName("reset_email")),
    wrongEmailTxt = $(byText("არასწორი ელ_ფოსტა")),
    addToCart = $(byClassName("product-cart "),0),
    clearCart = $(byClassName("clear")),
    searchInput = $(byClassName("srch-inp"));


}
