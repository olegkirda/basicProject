import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class classAttributePage extends driver {

    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
    public WebElement blueButton;

    public classAttributePage(WebDriver driver) {
        super(driver);
    }

    public void clickBlueButton() {
        this.blueButton.click();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }
}
