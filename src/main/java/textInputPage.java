import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class textInputPage extends driver {
    @FindBy(id = "newButtonName")
    public WebElement textField;

    @FindBy(id = "updatingButton")
    public WebElement updatingButton;

    public textInputPage(WebDriver driver) {
        super(driver);
    }

    public void clickUpdatingButton() {
        this.updatingButton.click();
    }

    private final String newButtonName = "New Button Name";

    public void enterNewButtonName() {
        this.textField.sendKeys(newButtonName);
    }

    public String getButtonText() {
        return updatingButton.getText();
    }
}
