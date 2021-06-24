import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class loadDelayPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Click on Button Appearing after Delay")
    public static void clickButtonAppearingAfterDelay() {
        homePage homePage = new homePage(driver);
        loadDelayPage loadDelayPage = new loadDelayPage(driver);

        homePage.open();
        homePage.clickLoadDelayLink();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loadDelayPage.clickButtonAppearingAfterDelay();
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
