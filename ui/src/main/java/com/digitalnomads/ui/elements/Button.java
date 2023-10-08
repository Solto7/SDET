package com.digitalnomads.ui.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;

public class Button extends BaseElement {

    public SelenideElement btn;

    public Button(String xpath) {
        this.btn = $(By.xpath(xpath));
    }

    public Button(String tag, String text) {
        this.btn = $(By.xpath("//" + tag + "[normalize-space()='" + text + "']"));
    }
    public Button click(){
        elementActions.clickTheButton(btn);
        return this;
    }
}
