package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.ConfigReader;
import java.io.IOException;

public class BaseTest {

    private ConfigReader configReader;
    protected WebDriver driver;

    //locate the driver and maximize the browser window
    @BeforeMethod
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        configReader = new ConfigReader();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }

//    public void openUrl1() {
//        String companyPageUrl = configReader.getProperty("companyPageUrl");
//        driver.get(companyPageUrl);
//    }
}
