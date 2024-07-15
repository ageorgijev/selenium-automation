package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

import static pages.HomePage.pageTite;

public class CompanyPage extends BasePage{

    public static final String pageTitle = "Learn How We Work and Drive Innovation Together | Symphony";

    @FindBy(xpath="//h1[contains(.,'Company')]")
    private WebElement company;

    @FindBy(xpath = "//ul[@class='currentOpenings--jobs']")
    private List<WebElement> openPositions;

    @FindBy(xpath = "//p[.='San Francisco']")
    private WebElement hqValue;

    @FindBy(xpath = "//ul[@class='pageMetaDetails--list']")
    private List <WebElement> table;

    public CompanyPage(WebDriver driver) {
        super(driver, pageTite);
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getHQValue(){
       return hqValue.getText().trim();
    }

}