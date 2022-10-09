package com.otus.driver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxWebDriver implements IDriver{

    @Override
    public WebDriver newDriver() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        FirefoxDriverManager.getInstance(DriverManagerType.FIREFOX).setup();
        return new FirefoxDriver(firefoxOptions);
    }
}
