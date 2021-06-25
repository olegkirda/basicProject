import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class mouseOverPage extends driver {
    @FindBy(xpath = "//*[@class ='text-primary']")
    public WebElement clickMeLink;

    @FindBy(id = "clickCount")
    public WebElement clickCount;

    public mouseOverPage(WebDriver driver) {
        super(driver);
    }

    public void doubleClickMeLink() {
        Actions action = new Actions(driver);
        action.doubleClick(clickMeLink);
        action.perform();
    }

    public String getClickCount() {
        return clickCount.getText();
    }
}
