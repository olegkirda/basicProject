import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class textInputPageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check the button name is changing")
    public static void clickUpdatingButtonTest() {
        homePage homePage = new homePage(driver);
        textInputPage textInputPage = new textInputPage(driver);

        homePage.open();
        homePage.clickTextInputLink();
        textInputPage.enterNewButtonName();
        textInputPage.clickUpdatingButton();
        Assert.assertEquals(textInputPage.getButtonText(), "New Button Name");

    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
