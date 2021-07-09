import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class dynamicTablePage extends driver {

    @FindBy(className = "bg-warning")
    public WebElement warningCPUmessage;

    @FindBy(xpath = "//span[text()='Chrome']/following-sibling::span[contains(text(), '%')]")
    public WebElement tableCPUvalue;

    public dynamicTablePage(WebDriver driver) {
        super(driver);
    }

    public String getWarningCPUvalue() {
        dynamicTablePage dynamicTablePage = new dynamicTablePage(driver);
        String warningCPUmessage = dynamicTablePage.warningCPUmessage.getText();
        return warningCPUmessage.split(" ")[2];
    }

    public String getCPUfromTable() {
        dynamicTablePage dynamicTablePage = new dynamicTablePage(driver);
        return dynamicTablePage.tableCPUvalue.getText();
    }
}
