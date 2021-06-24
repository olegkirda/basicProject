import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class scrollbarsPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check clicking on Hiding Button")
    public static void clickHidingButtonTest() {
        homePage homePage = new homePage(driver);
        scrollbarsPage scrollbarsPage = new scrollbarsPage(driver);

        homePage.open();
        homePage.clickScrollbarsLink();
        scrollbarsPage.clickHidingButton();
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
