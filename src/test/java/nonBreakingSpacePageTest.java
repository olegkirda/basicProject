import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class nonBreakingSpacePageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check My button clicking")
    public static void clickMyButtonTest() {
        homePage homePage = new homePage(driver);
        nonBreakingSpacePage nonBreakingSpacePage = new nonBreakingSpacePage(driver);

        homePage.open();
        homePage.clickNonBreakingSpaceLink();
        nonBreakingSpacePage.clickMyButton();
        Assert.assertEquals(nonBreakingSpacePage.getButtonText(), "My Button");
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
