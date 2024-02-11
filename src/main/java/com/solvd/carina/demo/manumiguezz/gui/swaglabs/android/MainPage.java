package com.solvd.carina.demo.manumiguezz.gui.swaglabs.android;

import com.solvd.carina.demo.manumiguezz.gui.swaglabs.common.LoginPageBase;
import com.solvd.carina.demo.manumiguezz.gui.swaglabs.common.MainPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = MainPageBase.class)
public class MainPage extends MainPageBase {

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc='test-Menu']/android.view.ViewGroup/android.widget.ImageView")
    private ExtendedWebElement menuButton;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isMenuButtonPresent() {
        return menuButton.isPresent();
    }

    @Override
    public void clickMenuButton() {
        menuButton.click();
    }

    @Override
    public boolean isMenuButtonClickable() {
        return menuButton.isClickable();
    }

}
