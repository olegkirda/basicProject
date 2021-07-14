import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class hiddenLayersPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check double clicking on Green button")
    public static void clickGreenButtonTest() {
        homePage homePage = new homePage(driver);
        hiddenLayersPage hiddenLayersPage = new hiddenLayersPage(driver);

        homePage.open();
        homePage.clickHiddenLayersLink();
        hiddenLayersPage.doubleClickGreenButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertTrue(hiddenLayersPage.isBlueButtonVisible());
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
