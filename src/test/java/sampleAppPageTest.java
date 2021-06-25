import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class sampleAppPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check filling and submiting the form")
    public static void submitFormTest() {
        homePage homePage = new homePage(driver);
        sampleAppPage sampleAppPage = new sampleAppPage(driver);

        homePage.open();
        homePage.clickSampleAppLink();
        sampleAppPage.enterUserName();
        sampleAppPage.enterPassword();
        sampleAppPage.clickLoginButton();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assert.assertEquals(sampleAppPage.getLoginStatus(), "Welcome, Name!");
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
