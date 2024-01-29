package tests.base;
import common.CommonAction;
import org.openqa.selenium.WebDriver;
import pages.TestCaseDayNotExist.TestCaseDayNotExist;
import pages.TestCaseGoToYahooRegistrationPage.TestCaseGoToYahooRegistrationPage;
import pages.TestCasePasswordPositiveAllValid.TestCasePasswordPositiveAllValid;
import pages.TestCasePasswordTooEasyToGuess.TestCasePasswordTooEasyToGuess;
import pages.TtestCasePasswordTooShort.TestCasePasswordTooShort;
public class BaseTest {
    protected WebDriver driver = CommonAction.creatDriver();
    protected TestCaseGoToYahooRegistrationPage Yahooone  = new TestCaseGoToYahooRegistrationPage(driver);
    protected TestCasePasswordTooShort Yahootwo = new TestCasePasswordTooShort(driver);
    protected TestCasePasswordTooEasyToGuess Yahoothree = new TestCasePasswordTooEasyToGuess(driver);
    protected TestCaseDayNotExist Yahoofour = new TestCaseDayNotExist(driver);
    protected TestCasePasswordPositiveAllValid Yahoofive = new TestCasePasswordPositiveAllValid(driver);
}
