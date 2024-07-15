package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class CareersPage extends BasePage{

    public static final String pageTitle = "Lift up your career and growth with Symphony | Symphony";

    @FindBy(xpath="//h3[@class='currentOpenings--title']")
    private WebElement currentOpenings;

    public CareersPage(WebDriver driver) {
        super(driver, pageTitle);
    }

    @FindBy(className = "currentOpenings--job-link")
    private List<WebElement> jobLinks;

    @FindBy(xpath = "//*[@id='current-openings']/div/ul/li[1]/a/div[2]")
    private WebElement firstJobOpenings;


    public void scrollToCurrentOpenings(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);",currentOpenings);
    }

    public String getTitleOfOpenedPositions(){
        return currentOpenings.getText().toString();
    }

    public int numberofOpeninJobs(){
        return jobLinks.size();
    }

    public String getTitleFromFirstJob(){
        return firstJobOpenings.getText().toString();
    }

}