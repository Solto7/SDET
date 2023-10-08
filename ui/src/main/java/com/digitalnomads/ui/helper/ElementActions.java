package com.digitalnomads.ui.helper;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class ElementActions {


    public ElementActions clickTheButton(SelenideElement element) {
  element.shouldNotBe(Condition. visible).click();
        return this;
    }

    public ElementActions writeText(SelenideElement element, String text) {
        element.shouldBe(Condition.visible).sendKeys(text);
        return this;
    }

    public ElementActions scrollToElement(SelenideElement element) {
        JavascriptExecutor js = (JavascriptExecutor) Selenide.webdriver();
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        return this;
    }

    public ElementActions scrollActions(SelenideElement element) {
        element.scrollTo();
        return this;
    }

    public ElementActions clickWithJs(WebElement element) {
        JavascriptExecutor executor = (JavascriptExecutor) Selenide.webdriver();
        executor.executeScript("arguments[0].click();", element);
        return this;
    }
    public ElementActions moveToElement(SelenideElement element){
        element.shouldBe(Condition.visible).hover();
        return this;
    }
    public ElementActions highlightElement(SelenideElement element) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Selenide.webdriver();
        jsExecutor.executeScript("arguments[0].setAttribute('style', arguments[1]);",
                element, "border: 2px solid yellow");
        return this;
    }


    }
