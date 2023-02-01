package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testCase.WebTestBase;
import util.ActionStuff;
import util.Utility;

import java.util.Set;

public class HomePage extends WebTestBase {

    @FindBy(xpath = "//input[@placeholder='Try Saree, Kurti or Search by Product Code']")
    WebElement searchBtn;


    @FindBy(xpath = "//span[text()='Women Ethnic']")
    WebElement womenEthics;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void SearchBtnClick() {
        searchBtn.click();
    }

    public void searchBox(String searchText) {
        searchBtn.sendKeys(searchText);
        searchBtn.sendKeys(Keys.ENTER);
    }

    public void mouseOverExample() {
        ActionStuff.moveToElement(driver, womenEthics);
        womenEthics.click();
    }

    public void cookieframe() {
        Utility.addcookies();
        Utility.setcookies();
    }
}
