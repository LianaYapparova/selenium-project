package com.otus.components;

import com.otus.pages.LessonPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class ListCourseComponent extends BaseComponents<ListCourseComponent> {

  @FindBy(css = ".lessons__new-item-title ")
  private List<WebElement> lessons;

  @FindBy(css = ".lessons__new-item-start ")
  private List<WebElement> dates;

  public ListCourseComponent(WebDriver driver) {
    super(driver);
  }

  public LessonPage findCourse(String nameOfCourse) {
    WebElement element = lessons.stream().filter(webElement -> webElement.getText().equals(nameOfCourse))
        .findFirst().get();
    clickWithBorder(element);
    return new LessonPage(driver);
  }

  public LessonPage findEarlyCourse() {
    WebElement webElement = dates.stream().reduce((element, element2) ->
        parseElement(element).before(parseElement(element2)) ? element : element2
    ).get();
    clickWithBorder(webElement);
    return new LessonPage(driver);
  }

  private Date parseElement(WebElement element) {
    try {
      return new SimpleDateFormat("dd MMMM", new Locale("ru")).parse(element.getText().substring(2));
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }
}
