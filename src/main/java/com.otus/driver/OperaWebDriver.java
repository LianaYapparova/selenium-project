package com.otus.driver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaWebDriver implements IDriver {
    @Override
    public WebDriver newDriver() {
        OperaOptions operaOptions = new OperaOptions();
        OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
        return new OperaDriver(operaOptions);
    }
}
