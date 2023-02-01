package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DropDownPage;
import pages.HomePage;
import testCase.WebTestBase;

public class DropDownTest extends WebTestBase {
    DropDownPage dropDownPage;
    HomePage homePage;

    public DropDownTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
        dropDownPage = new DropDownPage();
    }

    @Test
    public void dropdown() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.SearchBtnClick();
        homePage.searchBox(prop.getProperty("searchText"));
        dropDownPage.dropDownExample(prop.getProperty("select"));
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}

