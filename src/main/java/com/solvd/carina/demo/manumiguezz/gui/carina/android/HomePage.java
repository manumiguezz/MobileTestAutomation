package com.solvd.carina.demo.manumiguezz.gui.carina.android;

import com.solvd.carina.demo.manumiguezz.gui.carina.common.HomePageBase;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends HomePageBase {

    @FindBy(xpath = "//android.widget.Button[@resource-id='com.solvd.carinademoapplication:id/next_button']")
    private ExtendedWebElement nextButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isNextButtonPresent() {
        return nextButton.isPresent();
    }

    @Override
    public void clickNextButton() {
        nextButton.click();
    }
}
