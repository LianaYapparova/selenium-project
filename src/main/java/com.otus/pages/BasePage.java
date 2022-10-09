package com.otus.pages;

import com.otus.actions.CommonActions;
import org.openqa.selenium.WebDriver;

public abstract class BasePage<T> extends CommonActions<T> {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("https://otus.ru/");
    }
}
