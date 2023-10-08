package com.digitalnomads.ui.pages;

import com.digitalnomads.ui.elements.Button;

import static com.codeborne.selenide.Selenide.open;

public class HomePage extends BasePage {
    public Button foodBtn = new Button("a", "Еда");
    public Button pharmaBtn = new Button("a", "Аптека");
//    public SelenideElement ffoodBtn = $(By.xpath("//a[@class = \"menu-link \"][@href ='/food']"));
//    public SelenideElement pharmacyBtn = $(By.xpath("//a[@class = \"menu-link \"][@href ='/pharmacy']"));


    public HomePage openSite() {
        open("https://nambafood.kg/");
        return this;
    }

    public FoodPage clickFoodBtnOnBasePage() {
        foodBtn.click();
        return new FoodPage();
    }
}
