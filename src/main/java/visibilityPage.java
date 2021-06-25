import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class visibilityPage extends driver {
    @FindBy(id = "hideButton")
    public WebElement hideButton;

    @FindBy(id = "removedButton")
    public WebElement removedButton;

    @FindBy(id = "zeroWidthButton")
    public WebElement zeroWidthButton;

    @FindBy(id = "overlappedButton")
    public WebElement overlappedButton;

    @FindBy(id = "transparentButton")
    public WebElement transparentButton;

    @FindBy(id = "invisibleButton")
    public WebElement invisibleButton;

    @FindBy(id = "notdisplayedButton")
    public WebElement notdisplayedButton;

    @FindBy(id = "offscreenButton")
    public WebElement offscreenButton;

    public visibilityPage(WebDriver driver) {
        super(driver);
    }

    public void clickHideButton() {
        this.hideButton.click();
    }

}
