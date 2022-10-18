package com.otus.driver;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class OperaWebDriver implements IDriver {
  @Override
  public WebDriver newDriver(String... args) {
    OperaOptions operaOptions = new OperaOptions();
    operaOptions.addArguments(args);
    OperaDriverManager.getInstance(DriverManagerType.OPERA).setup();
    return new OperaDriver(operaOptions);
  }
}
