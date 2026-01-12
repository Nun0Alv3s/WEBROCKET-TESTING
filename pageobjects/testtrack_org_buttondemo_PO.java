package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class testtrack_org_buttondemo_PO {
    protected WebDriver driver;

    // Objects
    @FindBy(id = "primary-button")
    protected WebElement primaryButton;

    @FindBy(id = "secondary-button")
    protected WebElement secondaryButton;

    // NOTE: Xpath was not provided; using a generic, adjustable placeholder locator.
    @FindBy(xpath = "//span[@id='resultCounter']")
    protected WebElement resultCounterLabel;

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

    /**
     * Performs a left mouse button click on the secondary button.
     */
    public void clickSecondaryButton() {
        secondaryButton.click();
    }

    /**
     * Asserts that the result counter text equals the expected value.
     *
     * @param expectedText the text that should be present (e.g., "2")
     */
    public void assertResultCounterTextIs(String expectedText) {
        String actualText = resultCounterLabel.getText();
        Assert.assertEquals(actualText.trim(), expectedText, "Result counter text did not match the expected value.");
    }
}
