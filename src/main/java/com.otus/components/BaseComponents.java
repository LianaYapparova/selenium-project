package com.otus.components;

import com.otus.actions.CommonActions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BaseComponents<T> extends CommonActions<T> {
  public BaseComponents(WebDriver driver) {
    super(driver);
  }

  public void clickWithBorder(WebElement element) {
    ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red';", element);
    new Actions(driver)
        .moveToElement(element)
        .click()
        .perform();
  }
}
