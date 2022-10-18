package com.otus.pages;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LessonPage extends BasePage {
  public LessonPage(WebDriver driver) {
    super(driver);
  }


  public void checkTitle(String title) {
    Assertions.assertThat(driver.getTitle().contains(title)).isEqualTo(true);
  }
}
