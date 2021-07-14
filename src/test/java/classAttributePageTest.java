import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class classAttributePageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check clicking on Blue Button and pressing ok in Alert popup")
    public static void clickBlueButtonTest() {
        homePage homePage = new homePage(driver);
        classAttributePage classAttributePage = new classAttributePage(driver);

        homePage.open();
        homePage.clickClassAttributeLink();
        classAttributePage.clickBlueButton();
        classAttributePage.acceptAlert();
        Assert.assertEquals(classAttributePage.getButtonClassName(), "btn class3 btn-primary btn-test");
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
