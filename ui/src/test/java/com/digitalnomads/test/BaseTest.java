package com.digitalnomads.test;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.testng.SoftAsserts;
import com.codeborne.selenide.testng.TextReport;
import com.digitalnomads.ui.helper.ElementActions;
import com.digitalnomads.ui.pages.FoodPage;
import com.digitalnomads.ui.pages.HomePage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners({SoftAsserts.class})
public class BaseTest {
    public ElementActions elementActions;
    public FoodPage foodPage;
    public HomePage homePage;
@BeforeSuite
public void setUpSelenide(){
//    Configuration.headless = false;
//    Configuration.browser = "Chrome";
//    Configuration.timeout = 10000;
//    Configuration.screenshots = true;
//    Configuration.browserSize = "1920x1080";
//    Configuration.assertionMode = AssertionMode.SOFT;
//    Configuration.pageLoadStrategy = "normal";
}
    @BeforeClass
    public void setUp() {
        elementActions = new ElementActions();
        foodPage = new FoodPage();
        homePage = new HomePage();

    }

}
