package example_31;

import example_29.DataProviderClass;
import org.testng.annotations.Test;

/*
Run corresponding testng file to get below results from following path,
https://github.com/bipin-k/selenium/blob/master/src/test/java/example_31/testng.xml

Following will be the output when TestNG file is executed,
The capital of India is Delhi
The capital of USA is Washington
The capital of France is Paris
The capital of Nepal is Kathmandu
The capital of Germany is Berlin

 */

public class DataProviderCSVClass {

    @Test(dataProviderClass = DataProviderFromCSV.class, dataProvider = "countryCapitals")

    public void getStateCapital(String country, String capital){
        System.out.println("The capital of "+country+" is "+capital);
    }

}
