import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class hiddenLayersPage extends driver {

    @FindBy(id = "greenButton")
    public WebElement greenButton;

    public hiddenLayersPage(WebDriver driver) {
        super(driver);
    }

    public void doubleClickGreenButton() {
        Actions action = new Actions(driver);
        action.doubleClick(greenButton);
        action.perform();
    }

    public String getButtonColor() {
        return greenButton.getCssValue("background-color");
    }

}
