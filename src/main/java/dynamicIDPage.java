import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dynamicIDPage extends pageObject {

    @FindBy(xpath = "//*[@class ='btn btn-primary']")
    public WebElement buttonWithDynamicID;

    public dynamicIDPage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonWithDynamicID() {
        this.buttonWithDynamicID.click();
    }

}
