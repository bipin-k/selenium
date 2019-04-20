package example_29;

import org.testng.annotations.Test;

/*
Run corresponding testng file to get below results from following path,
https://github.com/bipin-k/selenium/blob/master/src/test/java/example_29/testng.xml

Following will be the output when corresponding TestNG file is executed,
The URL for Google is https://www.google.com
The URL for Yahoo is https://in.yahoo.com
The URL for DuckDuckGo is https://duckduckgo.com
The capital of Uttar Pradesh is Lucknow
The capital of Punjab is Chandigarh
The capital of Tamil Nadu is Chennai
The capital of Madhya Pradesh is Bhopal
The capital of Karnataka is Bengaluru
 */

public class TestNGDataProvider {

    @Test(dataProviderClass = DataProviderClass.class, dataProvider="searchEngines")

    public void getSearchEngineURL(String name, String url){
        System.out.println("The URL for "+name+" is "+url);
    }

    @Test(dataProviderClass = DataProviderClass.class, dataProvider = "stateCapitals")

    public void getStateCapital(String state, String capital){
        System.out.println("The capital of "+state+" is "+capital);
    }


}
