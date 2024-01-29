package pages.TestCasePasswordTooEasyToGuess;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;
public class TestCasePasswordTooEasyToGuess extends BasePage {
    public TestCasePasswordTooEasyToGuess(WebDriver driver){super(driver);}
    By mail = By.cssSelector("#ybarMailLink");
    By create = By.cssSelector("#createacc");
    By create2 = By.cssSelector(".signups");
    By password = By.cssSelector("#usernamereg-password");
    By day = By.cssSelector("#usernamereg-day");
    By error = By.cssSelector("#reg-error-password");
    public TestCasePasswordTooEasyToGuess three() {
        driver.findElement(mail).click();
        try {
            driver.findElement(create).click();
        } catch (Exception e) {
            driver.findElement(create2).click();}
        driver.findElement(password).sendKeys("123456789");
        driver.findElement(day).click();
        String actualErrMsg = "Can be guessed easily. Try something";
        String expectedErrMsg = driver.findElement(error).getText();
        if (actualErrMsg.contains(expectedErrMsg)) {
            System.out.println("TestCasePasswordTooEasyToGuess " + "PASSED");
        }
        else{
            System.out.println("TestCasePasswordTooEasyToGuess " + "FAILED");
        }
        return this;
    }
}
