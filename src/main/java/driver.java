import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class driver {
    protected WebDriver driver;

    public driver(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
