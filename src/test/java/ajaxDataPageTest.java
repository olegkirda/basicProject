import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ajaxDataPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check data loaded with AJAX get request")
    public static void clickButtonTriggeringAjaxRequestTest() {
        homePage homePage = new homePage(driver);
        ajaxDataPage ajaxDataPage = new ajaxDataPage(driver);

        homePage.open();
        homePage.clickAjaxDataLink();
        ajaxDataPage.clickAjaxButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Assert.assertEquals(ajaxDataPage.getStringText(), "Data loaded with AJAX get request.");

    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
