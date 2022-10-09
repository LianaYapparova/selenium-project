package com.otus.components;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@SuppressWarnings("ReassignedVariable")
public class ListCourseComponent extends BaseComponents<ListCourseComponent> {

    @FindBy(css = ".lessons__new-item-title ")
    private List<WebElement> lessons;

    @FindBy(css = ".lessons__new-item-start ")
    private List<WebElement> dates;

    public ListCourseComponent(WebDriver driver) {
        super(driver);
    }

    public void findCourse(String nameOfCourse) {
        WebElement element =  lessons.stream().filter(webElement -> webElement.getText().equals(nameOfCourse))
                .findFirst().get();
        clickWithBorder(element);
    }

    public void findEarlyCourse() {
        WebElement webElement = dates.stream().reduce((element, element2) ->
            parseElement(element).before(parseElement(element2)) ? element : element2
        ).get();
        clickWithBorder(webElement);
    }

    private Date parseElement(WebElement element){
        try {
            return new SimpleDateFormat("dd MMMM", new Locale("ru")).parse(element.getText().substring(2));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
