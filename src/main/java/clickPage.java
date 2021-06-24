import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class clickPage extends driver {
    @FindBy(id = "badButton")
    public WebElement badButton;

    public clickPage(WebDriver driver) {
        super(driver);
    }

    public void clickBadButton() {
        this.badButton.click();
    }
}
