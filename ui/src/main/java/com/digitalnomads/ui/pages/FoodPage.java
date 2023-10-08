package com.digitalnomads.ui.pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public class FoodPage extends BasePage {

    public ElementsCollection foods = $$(By.xpath("//div[@class='cat-wrap']/a"));

    public FoodPage clickFirstElementFromFood() {
        elementActions.clickTheButton(foods.get(0));
        return this;
    }


}
