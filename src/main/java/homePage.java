import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class homePage extends pageObject {

    @FindBy(xpath = "//*[@href='/dynamicid']")
    public WebElement dynamicIDLink;

    @FindBy(xpath = "//*[@href='/classattr']")
    public WebElement classAttributeLink;

    @FindBy(xpath = "//*[@href='/hiddenlayers']")
    public WebElement hiddenLayersLink;

    @FindBy(xpath = "//*[@href='/loaddelay']")
    public WebElement loadDelayLink;

    @FindBy(xpath = "//*[@href='/ajax']")
    public WebElement ajaxDataLink;

    public homePage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get("http://www.uitestingplayground.com/");
    }

    public void clickDynamicIDLink() {
        this.dynamicIDLink.click();
    }

    public void clickClassAttributeLink() {
        this.classAttributeLink.click();
    }

    public void clickHiddenLayersLink() {
        this.hiddenLayersLink.click();
    }

    public void clickLoadDelayLink() {
        this.loadDelayLink.click();
    }

    public void clickAjaxDataLink() {
        this.ajaxDataLink.click();
    }

}
