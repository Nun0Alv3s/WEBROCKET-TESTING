package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testtrack_org_PO {
    protected WebDriver driver;

    // Objects
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/div[2]/a[1]")
    protected WebElement mainLink;

    public testtrack_org_PO(WebDriver pDriver) {
        driver = pDriver;
        PageFactory.initElements(driver, this);
    }

    // Methods
    /**
     * Performs a standard left mouse button click on the main link element.
     */
    public void clickMainLink() {
        mainLink.click();
    }
}
