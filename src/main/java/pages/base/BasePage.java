package pages.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static common.Config.EXPLICIT_WAIT;

public class BasePage {
    protected static WebDriver driver;
    public BasePage (WebDriver driver) {this.driver = driver;}
    public static void open (String url){driver.get(url);}
    public WebElement waitElementIsVisible(WebElement element){
        new WebDriverWait(driver,EXPLICIT_WAIT).until(ExpectedConditions.visibilityOf(element));
        return element;
    }
}
