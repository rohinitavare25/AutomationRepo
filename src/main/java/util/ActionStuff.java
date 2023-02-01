package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import testCase.WebTestBase;

import java.util.List;
import java.util.Set;

public class ActionStuff extends WebTestBase {

    public static void moveToElement(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }

    public static void dropDownElement(List<WebElement> elements, String select) {
        for (WebElement e : elements) {
            System.out.println(e.getText());
            if (e.getText().equalsIgnoreCase(select)) {
                e.click();
                break;
            }
        }
    }


    public static void scrollDown(WebDriver driver, WebElement instagramIcon) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeAsyncScript("window.scrollBy(0,8200)");
//        javascriptExecutor.executeAsyncScript("arguments[0].scrollIntoView()", instagramIcon);

    }

    public static void switchToWindowsHandles(WebDriver driver) {


        String parentWindows = driver.getWindowHandle();
        Set<String> allWindow = driver.getWindowHandles();
        for (String s : allWindow) {
            if (!parentWindows.contentEquals(s)) {
                driver.switchTo().window(s);
                driver.close();
            }
            driver.switchTo().window(parentWindows);
        }
    }

}
