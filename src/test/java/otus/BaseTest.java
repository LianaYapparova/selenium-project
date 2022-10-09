package otus;

import com.otus.driver.WebDriverFactory;
import com.otus.listeners.MouseListener;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    public EventFiringWebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        driver = new WebDriverFactory().createWebDriver();
        driver.register(new MouseListener());
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
