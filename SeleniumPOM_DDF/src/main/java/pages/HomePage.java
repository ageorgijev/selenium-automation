package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    public static final String pageTite = "Software development and design for the world’s most innovative brands | Symphony";

    @FindBy(xpath="//a[contains(.,'About Us')]")
    private WebElement aboutUsLink;

    @FindBy(xpath = "//span[.='Careers']")
    private WebElement careersLink;

    @FindBy(xpath = "//a[.='Company']")
    private WebElement companyLink;

    public HomePage(WebDriver driver) {
        super(driver, pageTite);
    }

    public void clickOnCareers(){
        careersLink.click();
    }

    public void hoverOnAboutUs(){
        Actions actions = new Actions(driver);
        actions.moveToElement(aboutUsLink).perform();
        aboutUsLink.click();
    }

    public void clickOnCompany(){
        companyLink.click();
    }
}