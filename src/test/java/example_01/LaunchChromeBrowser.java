package example_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LaunchChromeBrowser {
    WebDriver driver;
    // Config path to get the current working directory of the repo
    String CURRENT_DIRECTORY= System.getProperty("user.dir");
    String baseurl= "https://www.google.co.in/";

    @BeforeSuite

    public void setup(){
        // Config path for chrome driver
        System.setProperty("webdriver.chrome.driver", CURRENT_DIRECTORY+"/driver/chromedriver/mac/chromedriver");
        driver= new ChromeDriver();
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