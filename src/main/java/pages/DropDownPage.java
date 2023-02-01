package pages;

import jdk.jshell.execution.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testCase.WebTestBase;
import util.ActionStuff;
import util.Utility;

import java.util.List;

public class DropDownPage extends WebTestBase {


    @FindBy(xpath= "//p[text()='Sort by : ']")
        WebElement dropDown;

    @FindBy(xpath = "//p[text()='Sort by : ']//following::span")
    List<WebElement> elements;


    public DropDownPage(){
        PageFactory.initElements(driver, this);
    }

    public void dropDownExample(String select)  {
            dropDown.click();
            ActionStuff.dropDownElement(elements, select);

        }
    }

