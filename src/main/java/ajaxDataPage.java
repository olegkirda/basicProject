import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ajaxDataPage extends driver {
    @FindBy(id = "ajaxButton")
    public WebElement ajaxButton;

    @FindBy(xpath = "//*[@class ='bg-success']")
    public WebElement textString;

    public ajaxDataPage(WebDriver driver) {
        super(driver);
    }

    public void clickAjaxButton() {
        this.ajaxButton.click();
    }

    public String getStringText() {
        return textString.getText();
    }
}
