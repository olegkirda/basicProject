import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class verifyTextPage extends driver {
    @FindBy(xpath = "//span[normalize-space(.)='Welcome UserName!']")
    public WebElement textString;

    public verifyTextPage(WebDriver driver) {
        super(driver);
    }

    public String getStringText() {
        return textString.getText();
    }
}
