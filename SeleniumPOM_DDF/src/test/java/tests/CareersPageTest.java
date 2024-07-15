package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CareersPage;
import java.io.FileWriter;
import java.io.IOException;
import static org.testng.Assert.assertEquals;
import static tests.util.Constants.careersURL;

public class CareersPageTest extends BaseTest {

    CareersPage careersPage;

    @BeforeMethod
    public void openUrl(){
        careersPage = new CareersPage(getDriver());
        driver.get(careersURL);
    }
    @Test (priority = 1)
    public void scrollToCurrentOpenings() {
        careersPage.scrollToCurrentOpenings();
    }

    @Test (priority = 1)
    public void verifyTitleOfOpenedPositions() {
        String expectedTitle = "Current Openings";
        String actualTitle = careersPage.getTitleOfOpenedPositions();
        assertEquals(actualTitle, expectedTitle);
    }

    @Test (priority = 1)
    public void verifyNumberOfOpenPositions() {
        int expectedCount = 5;
        int actualCount = careersPage.numberofOpeninJobs();
        assertEquals(actualCount, expectedCount);
    }

    //@lombok.SneakyThrows
    @Test (priority = 1)
    public void getJobTitleAndSaveTitleOfOpenedPositions() throws IOException {
        FileWriter writer = new FileWriter("src/main/resources/jobsOpeningPositionTitles.txt", true);
        writer.write(careersPage.getTitleFromFirstJob() + "\n");
        writer.close();
    }
}