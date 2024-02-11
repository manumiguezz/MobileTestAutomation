package com.solvd.carina.demo;

import com.solvd.carina.demo.manumiguezz.gui.carina.common.HomePageBase;
import com.solvd.carina.demo.manumiguezz.gui.swaglabs.common.LoginPageBase;
import com.solvd.carina.demo.manumiguezz.gui.swaglabs.common.MainPageBase;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyMobileTest implements IMobileUtils, IAbstractTest {

    @Test
    public void loginTest() {
        LoginPageBase loginPageBase = initPage(getDriver(), LoginPageBase.class);

        loginPageBase.typeUsername("standard_user");
        loginPageBase.typePassword("secret_sauce");
        Assert.assertTrue(loginPageBase.isLoginButtonPresent(), "log in button not present");
        loginPageBase.clickLoginButton();
    }

    @Test
    public void menuButtonTest() {
        MainPageBase mainPageBase = initPage(getDriver(), MainPageBase.class);

        Assert.assertTrue(mainPageBase.isMenuButtonPresent());
        Assert.assertTrue(mainPageBase.isMenuButtonClickable());
        mainPageBase.clickMenuButton();
    }

    @Test
    public void nextButtonTest() {
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);

        Assert.assertTrue(homePageBase.isNextButtonPresent());
        homePageBase.clickNextButton();
    }
}
