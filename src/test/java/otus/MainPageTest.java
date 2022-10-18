package otus;

import com.otus.components.ListCourseComponent;
import org.testng.annotations.Test;
import com.otus.pages.MainPageOtus;

public class MainPageTest extends BaseTest {

  @Test
  public void chooseCourseTest() {
    new MainPageOtus(driver).open();

    new ListCourseComponent(driver)
        .findCourse("Cloud Solution Architecture")
        .checkTitle("Cloud Solution Architecture");
  }


  @Test
  public void chooseEarlyCourseTest() {
    new MainPageOtus(driver).open();

    new ListCourseComponent(driver)
        .findEarlyCourse()
        .checkTitle("Cloud Solution Architecture");
  }
}
