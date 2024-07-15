package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import static tests.util.Constants.baseURL;

public class HomePageTest extends BaseTest{

    HomePage homePage;

    @BeforeMethod
    public void openUrl(){
        homePage = new HomePage(driver);
        driver.get(baseURL);
    }

    @Test
    public void hoverOnAboutUs(){
        homePage.hoverOnAboutUs();
        homePage.clickOnCompany();
    }
    @Test
    public void navigateToCareersPage() {
        homePage.clickOnCareers();
    }
}
