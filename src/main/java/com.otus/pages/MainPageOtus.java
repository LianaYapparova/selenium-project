package com.otus.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageOtus extends BasePage<MainPageOtus> {


  @FindBy(id = "text")
  private WebElement searchField;

  public MainPageOtus(WebDriver driver) {
    super(driver);
  }
}
