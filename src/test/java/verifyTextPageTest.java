import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class verifyTextPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check string text")
    public static void getStringTextTest() {
        homePage homePage = new homePage(driver);
        verifyTextPage verifyTextPage = new verifyTextPage(driver);

        homePage.open();
        homePage.clickVerifyTextLink();
        Assert.assertEquals(verifyTextPage.getStringText(), "Welcome UserName!");
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
