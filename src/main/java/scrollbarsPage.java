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

    public void scrollToHidingButton() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].scrollIntoView();", hidingButton);
    }

    public String getButtonText() {
        return hidingButton.getText();
    }
}
