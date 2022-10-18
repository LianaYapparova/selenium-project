package otus;

import com.otus.driver.WebDriverFactory;
import com.otus.listeners.MouseListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.*;

public class BaseTest {
  public EventFiringWebDriver driver;

  @BeforeMethod(alwaysRun = true)
  public void setUp() {
    driver = new WebDriverFactory().createWebDriver();
    driver.register(new MouseListener());
  }

  @AfterMethod(alwaysRun = true)
  public void tearDown() {
    driver.quit();
  }

}
