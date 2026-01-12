package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testtrack_org_buttondemo_PO {
    protected WebDriver driver;

    // Objects
    @FindBy(id = "primary-button")
    protected WebElement primaryButton;

    public testtrack_org_buttondemo_PO(WebDriver pDriver) {
        driver = pDriver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    /**
     * Clicks the primary button using the left mouse button.
     */
    public void clickPrimaryButton() {
        primaryButton.click();
    }
}
