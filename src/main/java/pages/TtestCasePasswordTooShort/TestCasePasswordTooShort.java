package pages.TtestCasePasswordTooShort;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
public class TestCasePasswordTooShort extends BasePage {
    public TestCasePasswordTooShort(WebDriver driver){super(driver);}
    By mail = By.cssSelector("#ybarMailLink");
    By create = By.cssSelector("#createacc");
    By create2 = By.cssSelector(".signups");
    By password = By.cssSelector("#usernamereg-password");
    By day = By.cssSelector("#usernamereg-day");
    By error = By.cssSelector("#reg-error-password");
    public TestCasePasswordTooShort two() {
        driver.findElement(mail).click();
        try {
            driver.findElement(create2).click();
        } catch (Exception e) {
            driver.findElement(create).click();}
            driver.findElement(password).sendKeys("hellow");
            driver.findElement(day).click();
            String actualErrMsg = "Not strong enough. Try adding";
            String expectedErrMsg = driver.findElement(error).getText();
            if (expectedErrMsg.contains(actualErrMsg)) {
                System.out.println("TestCasePasswordTooShort " + "PASSED");
            }
        else{
            System.out.println("TestCasePasswordTooShort " + "FAILED");
        }
        return this;
    }
        }
