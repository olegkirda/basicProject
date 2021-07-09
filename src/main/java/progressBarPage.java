import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class progressBarPage extends driver {

    @FindBy(id = "startButton")
    public WebElement startButton;

    @FindBy(id = "stopButton")
    public WebElement stopButton;

    @FindBy(id = "progressBar")
    public WebElement progressBar;

    @FindBy(id ="result")
    public WebElement result;

    public progressBarPage (WebDriver driver) {
        super(driver);
    }

    public void clickStartButton() {
        this.startButton.click();
    }

    public void clickStopButton() {
        this.stopButton.click();
    }

    public String getResultValue() {
        return result.getText();
    }
}
