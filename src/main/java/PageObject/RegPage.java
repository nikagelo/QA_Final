package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class RegPage {
    public  SelenideElement signInBtn = $(byText("შესვლა")),
    regLink = $(byText("გაიარეთ რეგისტრაცია")),
    firstNameInput = $(byName("first_name")),
    persNumberInput = $(byName("personal_id")),
    passwordInput = $(byName("reg_password")),
    emailInput = $(byName("reg_email")),
    phoneNumberInput = $(byName("phone")),
    regPasswordCofirmationInput = $(byName("reg_password_confirmation")),
    profilePic = $(byAttribute("for", "profile5")),
    regBtn = $(byClassName("regsub")),
    regSuccess = $(byText("რეგისტრაცია წარმატებით დასრულდა"));
}
