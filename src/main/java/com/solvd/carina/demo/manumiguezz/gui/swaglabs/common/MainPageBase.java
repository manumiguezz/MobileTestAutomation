package com.solvd.carina.demo.manumiguezz.gui.swaglabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class MainPageBase extends AbstractPage {
    public MainPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isMenuButtonPresent();

    public abstract void clickMenuButton();

    public abstract boolean isMenuButtonClickable();
}
