package example_29;

import org.testng.annotations.DataProvider;

public class DataProviderClass {


    @DataProvider(name = "searchEngines")

    public static Object[][] searchEngineURL() {
        return new Object[][] { { "Google", "https://www.google.com" }, { "Yahoo", "https://in.yahoo.com" }, {"DuckDuckGo", "https://duckduckgo.com"}};
    }


    @DataProvider(name = "stateCapitals")

    public static Object[][] stateCapital() {
        return new Object[][] { { "Uttar Pradesh", "Lucknow" }, { "Punjab", "Chandigarh" }, {"Tamil Nadu", "Chennai"}, {"Madhya Pradesh", "Bhopal"}, {"Karnataka", "Bengaluru"}};
    }
}
