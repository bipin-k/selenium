package example_30;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
Run corresponding testng file to get below results from following path,
https://github.com/bipin-k/selenium/blob/master/src/test/java/example_30/testng.xml

Following will be the output when corresponding TestNG file is executed,
Google
The capital of Uttar Pradesh is Lucknow
 */

public class TestNGParameterization {

    @Test
    @Parameters({"searchEngine"})

    public void getSearchEngineName(@Optional("Not Available") String searchEngine){
        System.out.println(searchEngine);
    }

    @Test
    @Parameters({"state", "capital"})

    public void getStateCapital(String state, String capital){
        System.out.println("The capital of "+state+" is "+capital);
    }
}
