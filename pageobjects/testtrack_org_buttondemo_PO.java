package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

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

    @FindBy(id = "destructive-button")
    protected WebElement destructiveButton;

    @FindBy(xpath = "//*[normalize-space(text())='2']")
    protected WebElement labelTwo;

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

    /**
     * Performs a left mouse button click on the destructive button.
     */
    public void clickDestructiveButton() {
        destructiveButton.click();
    }

    /**
     * Asserts that the destructive button is visible and enabled (activated).
     *
     * @param timeoutInSeconds maximum time in seconds to wait for the button to become visible (e.g., 10)
     * @throws AssertionError if the button is not visible or not enabled within the timeout
     */
    public void assertDestructiveButtonIsActivated(int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(destructiveButton));

        if (!destructiveButton.isDisplayed()) {
            throw new AssertionError("Destructive button is not visible.");
        }

        if (!destructiveButton.isEnabled()) {
            throw new AssertionError("Destructive button is visible but not activated (not enabled).");
        }
    }

    /**
     * Asserts that the destructive button is visible and enabled (activated).
     * Uses an explicit wait for the button to become visible.
     *
     * @param timeoutInSeconds maximum time to wait for the button to become visible (e.g., 10)
     */
    public void assertDestructiveButtonIsActivated(long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        wait.until(ExpectedConditions.visibilityOf(destructiveButton));
        if (!destructiveButton.isEnabled()) {
            throw new AssertionError("Destructive button is visible but not activated (enabled).");
        }
    }

    /**
     * Asserts that the text of the element equals the expected value.
     *
     * @param expectedText the expected text to be present (e.g., "2")
     */
    public void assertTextEquals(String expectedText) {
        String actualText = labelTwo.getText();
        Assert.assertEquals(actualText, expectedText, "Element text does not match the expected value.");
    }
}