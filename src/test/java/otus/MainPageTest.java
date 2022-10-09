package otus;

import com.otus.components.ListCourseComponent;
import org.testng.annotations.Test;
import com.otus.pages.MainPageOtus;

public class MainPageTest extends BaseTest{

    @Test
    public void chooseCourse(){
        new MainPageOtus(driver).open();

        new ListCourseComponent(driver)
                .findCourse("Machine Learning. Professional");
    }


    @Test
    public void chooseEarlyCourse(){
        new MainPageOtus(driver).open();

        new ListCourseComponent(driver)
                .findEarlyCourse();
    }
}
