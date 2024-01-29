package pages.TestCasePasswordPositiveAllValid;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import pages.base.BasePage;
public class TestCasePasswordPositiveAllValid extends BasePage {
    public TestCasePasswordPositiveAllValid(WebDriver driver){super(driver);}
    By mail = By.cssSelector("#ybarMailLink");
    By create = By.cssSelector("#createacc");
    By create2 = By.cssSelector(".signups");
    By name = By.cssSelector("#usernamereg-firstName");
    By lname = By.cssSelector("#usernamereg-lastName");
    By nmail = By.cssSelector("#usernamereg-userId");
    By pass = By.cssSelector("#usernamereg-password");
    By month = By.cssSelector("#usernamereg-month");
    By day = By.cssSelector("#usernamereg-day");
    By year = By.cssSelector("#usernamereg-year");
    By cont = By.cssSelector("#reg-submit-button");
    By finish = By.cssSelector(".challenge-heading");
    public TestCasePasswordPositiveAllValid five(){
       driver.findElement(mail).click();
       try {
           driver.findElement(create).click();
       }
       catch (Exception e){
           driver.findElement(create2).click();
       }
       driver.findElement(name).sendKeys("Gakson");
       driver.findElement(lname).sendKeys("Geksonov");
       driver.findElement(nmail).sendKeys("Grgr123grgr123");
       driver.findElement(pass).sendKeys("asd123456789A.");
       driver.findElement(day).sendKeys("11");
       driver.findElement(year).sendKeys("1995");
       Select sel = new Select(driver.findElement(month));
       sel.selectByValue("11");
       driver.findElement(cont).click();
       String expectedTitle = "Secure your";
       String actualTitle = driver.findElement(finish).getText();
       if (actualTitle.contains(expectedTitle)){
           System.out.println("TestCasePasswordPositiveAllValid " + "PASSED");
       }
       else {
           System.out.println("TestCasePasswordPositiveAllValid " + "FAILED");
       }
       return this;
    }
}
