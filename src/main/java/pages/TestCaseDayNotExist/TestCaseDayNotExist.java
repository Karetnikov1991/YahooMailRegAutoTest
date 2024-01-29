package pages.TestCaseDayNotExist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;
public class  TestCaseDayNotExist extends BasePage {
    public  TestCaseDayNotExist(WebDriver driver){super(driver);}
    By mail = By.cssSelector("#ybarMailLink");
    By create = By.cssSelector("#createacc");
    By create2 = By.cssSelector(".signups");
    By password = By.cssSelector("#usernamereg-password");
    By day = By.cssSelector("#usernamereg-day");
    By year = By.cssSelector("#usernamereg-year");
    By month = By.cssSelector("#usernamereg-month");
    By erro = By.cssSelector("#reg-error-birthDate");
    public  TestCaseDayNotExist four() {
        driver.findElement(mail).click();
        try {
            driver.findElement(create).click();
        } catch (Exception e) {
            driver.findElement(create2).click();}
        Select sel = new  Select(driver.findElement(month));
        sel.selectByValue("11");
        driver.findElement(day).sendKeys("33");
        driver.findElement(year).sendKeys("1990");
        driver.findElement(password).click();
        String actualErrMsg = "That doesn’t look right, please re-enter your";
        String expectedErrMsg = driver.findElement(erro).getText();
        if (actualErrMsg.contains(expectedErrMsg)) {
            System.out.println("TestCaseDayNotExist " + "PASSED");
        }
        else{
            System.out.println("TestCaseDayNotExist " + "FAILED");
        }
        return this;
    }
}
