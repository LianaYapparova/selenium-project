package com.otus.driver;

import com.otus.exceptions.DriverTypeNotSupported;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.util.Locale;

public class WebDriverFactory {
  private String browserType = System.getProperty("browser").toLowerCase(Locale.ROOT);

  public EventFiringWebDriver createWebDriver() {
    switch (browserType) {
      case "chrome":
        return new EventFiringWebDriver(new ChromeWebDriver().newDriver());
      case "firefox":
        return new EventFiringWebDriver(new FireFoxWebDriver().newDriver());
      case "opera":
        return new EventFiringWebDriver(new OperaWebDriver().newDriver());
      default:
        try {
          throw new DriverTypeNotSupported(this.browserType);
        } catch (DriverTypeNotSupported ex) {
          ex.printStackTrace();
          return null;
        }
    }
  }
}
