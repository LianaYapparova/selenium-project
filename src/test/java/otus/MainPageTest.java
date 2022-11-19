package otus;

import com.otus.components.ListCourseComponent;
import org.testng.annotations.Test;
import com.otus.pages.MainPageOtus;

public class MainPageTest extends BaseTest {

  @Test
  public void chooseCourseTest() {
    new MainPageOtus(driver).open();

    new ListCourseComponent(driver)
        .findCourse("Data Engineer")
        .checkTitle("Data Engineer");
  }


  @Test
  public void chooseEarlyCourseTest() {
    new MainPageOtus(driver).open();

    new ListCourseComponent(driver)
        .findEarlyCourse()
        .checkTitle("Выбор профессии в IT");
  }
}
