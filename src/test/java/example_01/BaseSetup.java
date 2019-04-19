package example_01;

import org.openqa.selenium.WebDriver;

public class BaseSetup {
    WebDriver driver;

    public static String getOperatingSystem(){
        String operatingSystem= System.getProperty("os.name").toLowerCase();
        if (operatingSystem.contains("mac")){
            return "mac";
        }
        else if (operatingSystem.contains("linux")){
            return "linux";
        }
        else if (operatingSystem.contains("windows") || operatingSystem.contains("win")){
            return "windows";
        }
        return operatingSystem;
    }

    public void setBrowserDriverPath(String operatingSystem, String browser){

        if (operatingSystem == "mac"){

        }
        else if (operatingSystem == "windows" || operatingSystem == "win"){

        }
        else if (operatingSystem == "linux"){

        }
    }
}
