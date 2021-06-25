import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class visibilityPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check elements are invisible after clicking on Hide Button")
    public static void clickHideButtonTest() {
        homePage homePage = new homePage(driver);
        visibilityPage visibilityPage = new visibilityPage(driver);

        homePage.open();
        homePage.clickVisibilityLink();
        visibilityPage.clickHideButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertFalse(visibilityPage.removedButton.isDisplayed());

    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
