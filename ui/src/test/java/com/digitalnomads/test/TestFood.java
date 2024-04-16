package com.digitalnomads.test;

import com.codeborne.selenide.CollectionCondition;
import com.digitalnomads.ui.pages.HomePage;
import io.qameta.allure.testng.Tag;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.testng.AssertJUnit.assertTrue;

public class TestFood extends BaseTest {

    @Test
    @Tag("Smoke")
    public void  testFoodButtons() {
        homePage.openSite()
                .clickFoodBtnOnBasePage()
                .clickFirstElementFromFood();
    }
    @Test
    @Tag("Regress")
    public void checkKitchAmountTest(){
        homePage.openSite().clickFoodBtnOnBasePage();
        Assert.assertEquals(foodPage.foods.size(),16);
    }
    @Test
    public void nationalKitchenTest(){
        homePage.openSite().clickFoodBtnOnBasePage();
           Assert.assertTrue(foodPage.foods.stream().anyMatch(element -> element.getText().contains("НАЦИОНАЛЬНАЯ КУХНЯ")));
           Assert.assertTrue(foodPage.foods.stream().anyMatch(element -> element.getText().contains("КИТАЙСКАЯ КУХНЯ")));
          //  foodPage.foods.forEach(element -> System.out.println(element.getText()));
    }
    @Test
    public void selenideTest() throws InterruptedException {
    open("https://nambafood.kg");
    $(By.xpath("//a[@class = \"menu-link \"][@href ='/food']")).click();
    $$(By.xpath("//div[@class='cat-wrap']/a")).shouldHave(CollectionCondition.size(16));
    assertTrue($$(By.xpath("//div[@class='cat-wrap']/a"))
            .stream().anyMatch(e -> e.getText().contains("НАЦИОНАЛЬНАЯ КУХНЯ")));
    }
}
