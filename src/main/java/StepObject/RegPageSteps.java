package StepObject;

import PageObject.RegPage;
import com.codeborne.selenide.Condition;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.sleep;

public class RegPageSteps  extends RegPage {
    public RegPageSteps clickSignIn(){
        signInBtn.click();
        return this;
    }
    public RegPageSteps clickOnRegistrationLink(){
        regLink.click();
        return this;
    }

    public RegPageSteps fillNames(String nameAndLast){
        firstNameInput.setValue(nameAndLast);
        return this;
    }
    public RegPageSteps fillPersonalNumber(String personalNumber){
        persNumberInput.setValue(personalNumber);
        persNumberInput.shouldNotBe(Condition.empty);
        return this;
    }

    public RegPageSteps checkPersonalNumber(String wrongPersNum){
        persNumberInput.setValue(wrongPersNum);
        persNumberInput.shouldBe(Condition.empty);
        return this;
    }

    public RegPageSteps fillPassword(String password){
        passwordInput.setValue(password);
        return this;
    }

    public RegPageSteps fillPhoneNumber(String phone){
        phoneNumberInput.setValue(phone);

        return this;
    }

    public RegPageSteps passwordConfirmation(String passwordConifrm){
        regPasswordCofirmationInput.setValue(passwordConifrm);
        Assert.assertEquals(passwordInput.getValue(), regPasswordCofirmationInput.getValue());
        return this;
    }

    public RegPageSteps choosepic(){
        profilePic.click();
        return this;
    }

    public RegPageSteps clickOnRegBtn(){
        regBtn.click();
        return this;
    }

    public RegPageSteps checkNumbers(String wrongPersNum){
        persNumberInput.setValue(wrongPersNum);
        phoneNumberInput.setValue(wrongPersNum);
        Assert.assertEquals(persNumberInput.getValue(), phoneNumberInput.getValue());
        return this;
    }
    public  RegPageSteps wrongReg(){
        regSuccess.shouldNotBe(Condition.visible);
        return this;
    }
}
