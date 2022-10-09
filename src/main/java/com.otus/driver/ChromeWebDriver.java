package com.otus.driver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeWebDriver implements IDriver{
    @Override
    public WebDriver newDriver() {
        ChromeOptions chromeOptions = new ChromeOptions();
        ChromeDriverManager.getInstance(DriverManagerType.CHROME).setup();
        return new ChromeDriver(chromeOptions);
    }
}
