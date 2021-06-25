import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamicIDPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check clicking on Button with Dynamic ID")
    public static void clickButtonWithDynamicIDTest() {
        homePage homePage = new homePage(driver);
        dynamicIDPage dynamicIDpage = new dynamicIDPage(driver);

        homePage.open();
        homePage.clickDynamicIDLink();
        dynamicIDpage.clickButtonWithDynamicID();
        Assert.assertEquals(dynamicIDpage.getButtonText(), "Button with Dynamic ID");
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
