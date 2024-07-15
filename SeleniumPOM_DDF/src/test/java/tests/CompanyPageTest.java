package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.CompanyPage;
import static tests.util.Constants.companyURL;
import static tests.util.Constants.HQ_VALUE;
import tests.data.DataProvider;

public class CompanyPageTest extends BaseTest{

    CompanyPage companyPage;
    DataProvider dataProvider;

    @BeforeMethod
    public void openUrl(){
        companyPage = new CompanyPage(getDriver());
        driver.get(companyURL);
    }

    @Test
    public void verifyCompanyPageTitle() {
        Assert.assertEquals(companyPage.getTitle(), CompanyPage.pageTitle);
    }

    @Test
    public void verifyCompanyPageUrl(){
        String expectedUrl = companyURL;
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl);
    }

    @Test
    public void verifyTextForHQ(){
        Assert.assertEquals(companyPage.getHQValue(), HQ_VALUE);
        //Assert.assertEquals(companyPage.getHQValue(), dataProvider.getHQ_value());
    }

}