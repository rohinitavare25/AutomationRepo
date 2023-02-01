package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.DropDownPage;
import pages.HomePage;
import pages.WindowHandlePage;
import testCase.WebTestBase;

public class HomeTest extends WebTestBase {
    HomePage homePage;
    WindowHandlePage instagramPage;
    DropDownPage dropDownPage;

    public HomeTest(){super();}

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        homePage = new HomePage();
    }

    @Test(description = "search Test", priority = 1)
    public void verifySearchFunctionality() {
        SoftAssert softAssert = new SoftAssert();
        homePage.SearchBtnClick();
        homePage.searchBox(prop.getProperty("searchText"));
        softAssert.assertAll();
    }
    @Test (description = "mouseover", priority = 2)
    public void verifyMouseOverFunctionality() throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseOverExample();
        softAssert.assertAll();
    }

//    @Test(description = "dropdown", priority = 3)
//    public void dropdown() throws InterruptedException {
//        SoftAssert softAssert = new SoftAssert();
//        dropDownPage.dropDownExample();
//        softAssert.assertAll();
//    }

//    @Test(description = "windowhandle", priority = 4)
//    public void verifyWindow() {
//        SoftAssert softAssert = new SoftAssert();
//        instagramPage.instagram();
//        softAssert.assertAll();
//    }
    @Test(description = "Cookie",priority = 3)
    public void cookies(){
        SoftAssert softAssert = new SoftAssert();
        homePage.cookieframe();
        softAssert.assertAll();
    }

}
