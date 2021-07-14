import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class hiddenLayersPage extends driver {

    @FindBy(id = "greenButton")
    public WebElement greenButton;

    @FindBy(id = "blueButton")
    public WebElement blueButton;

    public hiddenLayersPage(WebDriver driver) {
        super(driver);
    }

    public void doubleClickGreenButton() {
        Actions action = new Actions(driver);
        action.doubleClick(greenButton);
        action.perform();
    }

    public boolean isBlueButtonVisible() {
        try {
            if (blueButton.isEnabled()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

}
