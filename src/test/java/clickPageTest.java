import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class clickPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check clicking Button That Ignores DOM Click Event")
    public static void clickBadButtonTest() {
        homePage homePage = new homePage(driver);
        clickPage clickPage = new clickPage(driver);

        homePage.open();
        homePage.clickClickLink();
        clickPage.clickBadButton();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assert.assertEquals(clickPage.getButtonClassName(), "btn btn-success");
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
