package example_02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LaunchFirefoxBrowser {
    WebDriver driver;
    // Config path to get the current working directory of the repo
    String CURRENT_DIRECTORY= System.getProperty("user.dir");
    String baseurl= "https://www.google.co.in/";

    @BeforeSuite

    public void setup(){
        // Config path for gecko driver
        System.setProperty("webdriver.gecko.driver", CURRENT_DIRECTORY+"/driver/firefoxdriver/mac/geckodriver");
        driver= new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @Test

    public void test() throws InterruptedException{
        driver.get(baseurl);
        Thread.sleep(5000);
    }

    @AfterSuite

    public void quit(){
        driver.quit();
    }
}
