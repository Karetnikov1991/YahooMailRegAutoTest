package tests.Yahoo;
import org.testng.annotations.Test;
import pages.base.BasePage;
import tests.base.BaseTest;
public class Yahoo extends BaseTest {
    @Test
    public void first() {
        BasePage.open("https://www.yahoo.com/");
        Yahooone.one();
    }
    @Test
    public void second() {
        BasePage.open("https://www.yahoo.com/");
        Yahootwo.two();
    }
    @Test
    public void third() {
            BasePage.open("https://www.yahoo.com/");
            Yahoothree.three();
    }
    @Test
    public void fourth() {
        BasePage.open("https://www.yahoo.com/");
        Yahoofour.four();
    }
    @Test
    public void fifth() {
        BasePage.open("https://www.yahoo.com/");
        Yahoofive.five();
    }
}

