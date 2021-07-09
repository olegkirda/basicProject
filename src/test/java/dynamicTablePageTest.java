import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dynamicTablePageTest {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
    }

    @Test(testName = "Check that warning CPU message meets table value")
    public static void dynamicTableCPUvalueTest() {
        homePage homePage = new homePage(driver);
        dynamicTablePage dynamicTablePage = new dynamicTablePage(driver);

        homePage.open();
        homePage.clickDynamicTableLink();

        String valueOfCPUwarningMessage = dynamicTablePage.getWarningCPUvalue();
        String valueOfCPUfromTable = dynamicTablePage.getCPUfromTable();

        Assert.assertEquals(valueOfCPUwarningMessage, valueOfCPUfromTable);
    }

    @AfterTest
    public static void cleanUp() {
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
