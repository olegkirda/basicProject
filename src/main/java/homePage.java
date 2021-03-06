import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage extends driver {

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

    @FindBy(xpath = "//*[@href='/clientdelay']")
    public WebElement clientSideDelayLink;

    @FindBy(xpath = "//*[@href='/click']")
    public WebElement clickLink;

    @FindBy(xpath = "//*[@href='/textinput']")
    public WebElement textInputLink;

    @FindBy(xpath = "//*[@href='/scrollbars']")
    public WebElement scrollbarsLink;

    @FindBy(xpath = "//*[@href='/dynamictable']")
    public WebElement dynamicTableLink;

    @FindBy(xpath = "//*[@href='/verifytext']")
    public WebElement verifyTextLink;

    @FindBy(xpath = "//*[@href='/progressbar']")
    public WebElement progressBarLink;

    @FindBy(xpath = "//*[@href='/visibility']")
    public WebElement visibilityLink;

    @FindBy(xpath = "//*[@href='/sampleapp']")
    public WebElement sampleAppLink;

    @FindBy(xpath = "//*[@href='/mouseover']")
    public WebElement mouseOverLink;

    @FindBy(xpath = "//*[@href='/nbsp']")
    public WebElement nonBreakingSpaceLink;

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

    public void clickClientSideDelayLink() {
        this.clientSideDelayLink.click();
    }

    public void clickClickLink() {
        this.clickLink.click();
    }

    public void clickTextInputLink() {
        this.textInputLink.click();
    }

    public void clickScrollbarsLink() {
        this.scrollbarsLink.click();
    }

    public void clickDynamicTableLink() {
        this.dynamicTableLink.click();
    }

    public void clickVerifyTextLink() {
        this.verifyTextLink.click();
    }

    public void clickProgressBarLink() {
        this.progressBarLink.click();
    }

    public void clickVisibilityLink() {
        this.visibilityLink.click();
    }

    public void clickSampleAppLink() {
        this.sampleAppLink.click();
    }

    public void clickMouseOverLink() {
        this.mouseOverLink.click();
    }

    public void clickNonBreakingSpaceLink() {
        this.nonBreakingSpaceLink.click();
    }

}
