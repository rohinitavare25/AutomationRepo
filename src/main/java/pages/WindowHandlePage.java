package pages;

import jdk.jshell.execution.Util;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testCase.WebTestBase;
import util.ActionStuff;
import util.Utility;

public class WindowHandlePage extends WebTestBase {
    @FindBy(xpath = "//span[text()='Download App']")
    WebElement handle;

    @FindBy(xpath = "//img[@alt='google-playstore-icon']")
    WebElement google;

    public WindowHandlePage() {
        PageFactory.initElements(driver, this);
    }

    public void setHandle() {
        handle.click();
        ActionStuff.moveToElement(driver, handle);
        google.click();
        ActionStuff.switchToWindowsHandles(driver);
    }
}