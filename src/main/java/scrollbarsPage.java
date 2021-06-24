import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class scrollbarsPage extends driver {
    @FindBy(id = "hidingButton")
    public WebElement hidingButton;

    public scrollbarsPage(WebDriver driver) {
        super(driver);
    }

    public void clickHidingButton() {
        this.hidingButton.click();
    }

    /*public void clickHidingButton() {
        JavascriptExecutor JS = (JavascriptExecutor) driver;
        try {
           Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hidingButton.click();
    }*/

}
