package pages.TestCaseGoToYahooRegistrationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
public class TestCaseGoToYahooRegistrationPage extends BasePage {
    public TestCaseGoToYahooRegistrationPage(WebDriver driver){super(driver);}
    By mail = By.cssSelector("#ybarMailLink");
    By create = By.cssSelector("#createacc");
    By create2 = By.cssSelector(".signups");
    By creatayahoo = By.cssSelector(".challenge-heading");
    public TestCaseGoToYahooRegistrationPage one(){
        driver.findElement(mail).click();
        try {
            driver.findElement(create2).click();}
        catch (Exception e){
            driver.findElement(create).click();
        }
        String expectedTitle = "Create a Yahoo account";
        String actualTitle = driver.findElement(creatayahoo).getText();
        if (expectedTitle.contains(actualTitle)){
            System.out.println("TestCaseGoToYahooRegistrationPage " + "PASSED");
        }
        else {
            System.out.println("TestCaseGoToYahooRegistrationPage " + "FAILED");
        }
        return this;
        }
    }








