package com.otus.pages;

import com.otus.actions.CommonActions;
import org.openqa.selenium.WebDriver;

public abstract class BasePage<T> extends CommonActions<T> {

  public BasePage(WebDriver driver) {
    super(driver);
  }

  public T open() {
    driver.get(getBaseUrl());
    return (T) this;
  }

  public String getBaseUrl() {
    return System.getProperty("webdriver.base.url");
  }
}
