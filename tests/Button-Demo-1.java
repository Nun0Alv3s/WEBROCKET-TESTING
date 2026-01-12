package tests;

import java.time.Duration;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageobjects.testtrack_org_PO;
import pageobjects.testtrack_org_buttondemo_PO;
import tmpksgktlxj.pageobjects.testtrack_org_buttondemo_PO as TmpTesttrackOrgButtondemoPO; // Note: Java does not support alias imports; adjust package usage as needed

public class Button_Demo_1 {

    protected WebDriver driver = new ChromeDriver();

    @Test
    public void Button_Demo_1_test(){

        driver.get("https://testtrack.org");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        testtrack_org_PO testtrackOrgPO = new testtrack_org_PO(driver);
        testtrackOrgPO.clickPrimaryLink();

        testtrack_org_buttondemo_PO testtrackOrgButtondemoPO = new testtrack_org_buttondemo_PO(driver);
        testtrackOrgButtondemoPO.clickPrimaryButton();

        tmpksgktlxj.pageobjects.testtrack_org_buttondemo_PO secondaryButtonPO = new tmpksgktlxj.pageobjects.testtrack_org_buttondemo_PO(driver);
        secondaryButtonPO.clickSecondaryButton();
    }

    @AfterTest
    public void teardown(){
        driver.quit();
    }
}
