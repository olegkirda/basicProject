import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sampleAppPage extends driver {
    @FindBy(name = "UserName")
    public WebElement userNameField;

    @FindBy(name = "Password")
    public WebElement passwordField;

    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy(id = "loginstatus")
    public WebElement loginStatusString;

    public sampleAppPage(WebDriver driver) {
        super(driver);
    }


    private final String userName = "Name";

    public void enterUserName() {
        this.userNameField.sendKeys(userName);
    }

    private final String password = "pwd";
    public void enterPassword() {
        this.passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }

    public String getLoginStatus() {
        return loginStatusString.getText();
    }

}
