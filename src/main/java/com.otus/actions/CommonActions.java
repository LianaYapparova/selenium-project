package com.otus.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.otus.waiters.StandartWaiter;

public abstract class CommonActions<T> {

  protected WebDriver driver;

  protected StandartWaiter standartWaiter;

  public CommonActions(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
    standartWaiter = new StandartWaiter(driver);
  }


}
