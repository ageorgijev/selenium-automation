package pages;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver, String pageTitle) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//    public void open(String url){
//        driver.get(url);
//    }
//
//    public String getCurrentUrl(){
//        return driver.getCurrentUrl();
//    }
}