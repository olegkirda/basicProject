import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class progressBarPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check that Progress Bar stopped at 75%")
    public static void progressBarTest() {
        homePage homePage = new homePage(driver);
        progressBarPage progressBarPage = new progressBarPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 20);

        homePage.open();
        homePage.clickProgressBarLink();
        progressBarPage.clickStartButton();
        wait.until(ExpectedConditions.textToBePresentInElement(progressBarPage.progressBar, "75%"));
        progressBarPage.clickStopButton();
        Assert.assertTrue(progressBarPage.getResultValue().contains("Result: 0"));
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
