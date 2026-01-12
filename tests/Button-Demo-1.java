package tests;

import java.time.Duration;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Demo_1 {

    protected WebDriver driver = new ChromeDriver();

    @Test
    public void Button_Demo_1_test(){

        driver.get("https://testtrack.org");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterTest
    public void teardown(){
        driver.quit();   
    }
}