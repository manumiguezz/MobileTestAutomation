package com.solvd.carina.demo.manumiguezz.gui.carina.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class SignUpPageBase extends AbstractPage {
    public SignUpPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeUsername (String username);

    public abstract void typePassword (String password);

    public abstract void selectMale ();

    public abstract void agreeToPrivacyPolicy();

    public abstract void clickSignUpButton();

    public abstract boolean isSignUpPresent ();
}
