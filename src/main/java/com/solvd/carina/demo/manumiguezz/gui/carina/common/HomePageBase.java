package com.solvd.carina.demo.manumiguezz.gui.carina.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class HomePageBase extends AbstractPage {
    public HomePageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isNextButtonPresent ();

    public abstract void clickNextButton ();
}
