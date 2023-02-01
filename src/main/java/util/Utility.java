package util;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import testCase.WebTestBase;

import java.time.Duration;
import java.util.Set;

public class Utility  extends WebTestBase {

    public static final long PAGE_LOAD_TIMEOUT = 20;
    public static final long IMPLICITY_WAIT = 20;

    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static void addcookies() {
        Cookie cok = new Cookie("Hello", "World");
        driver.manage().addCookie(cok);
    }

    public static void setcookies() {
        Set<Cookie> cookies = driver.manage().getCookies();

        for (Cookie c : cookies) {
            System.out.println(c);
        }

    }
}
