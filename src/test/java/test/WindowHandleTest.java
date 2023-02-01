package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.WindowHandlePage;
import testCase.WebTestBase;

public class WindowHandleTest extends WebTestBase {
    WindowHandlePage windowHandlePage;
    HomePage homePage;

    public WindowHandleTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
       windowHandlePage = new WindowHandlePage();
    }

    @Test
    public void windowHandleFunctionality() {
        SoftAssert softAssert = new SoftAssert();
        windowHandlePage.setHandle();
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod() {
        driver.close();
    }
}
