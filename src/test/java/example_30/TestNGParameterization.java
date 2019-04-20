package example_30;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

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
