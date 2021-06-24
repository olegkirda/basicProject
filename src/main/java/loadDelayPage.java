import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loadDelayPage extends homePage {

    @FindBy(xpath = "//*[@class='btn btn-primary']")
    public WebElement buttonAppearingAfterDelay;

    public loadDelayPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonAppearingAfterDelay() {
        this.buttonAppearingAfterDelay.click();
    }

    public String getButtonText() {
        return buttonAppearingAfterDelay.getText();
    }

}
