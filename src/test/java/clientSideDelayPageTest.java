import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class clientSideDelayPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check data calculated on the client side")
    public static void clickButtonTriggeringClientSideLogicTest() {
        homePage homePage = new homePage(driver);
        clientSideDelayPage clientSideDelayPage = new clientSideDelayPage(driver);

        homePage.open();
        homePage.clickClientSideDelayLink();
        clientSideDelayPage.clickAjaxButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(clientSideDelayPage.getStringText(), "Data calculated on the client side.");

    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
