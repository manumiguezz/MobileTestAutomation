package com.solvd.carina.demo.manumiguezz.gui.carina.android;

import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = com.solvd.carina.demo.manumiguezz.gui.carina.common.SignUpPageBase.class)
public class SignUpPageBase extends com.solvd.carina.demo.manumiguezz.gui.carina.common.SignUpPageBase {

    @FindBy(id = "name")
    private ExtendedWebElement usernameInputField;

    @FindBy(id = "password")
    private ExtendedWebElement passwordInputField;

    @FindBy(id = "radio_male")
    private ExtendedWebElement maleSelector;

    @FindBy(id = "checkbox")
    private ExtendedWebElement privacyPolicySwitcher;

    @FindBy(id = "login_button")
    private ExtendedWebElement signUpButton;

    public SignUpPageBase(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeUsername(String username) {
        usernameInputField.type(username);
    }

    @Override
    public void typePassword(String password) {
        passwordInputField.type(password);
    }

    @Override
    public void selectMale() {
        maleSelector.click();
    }

    @Override
    public void agreeToPrivacyPolicy() {
        privacyPolicySwitcher.click();
    }

    @Override
    public void clickSignUpButton() {
        signUpButton.click();
    }

    @Override
    public boolean isSignUpPresent() {
        return signUpButton.isPresent();
    }
}
