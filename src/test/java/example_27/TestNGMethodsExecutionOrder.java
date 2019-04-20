package example_27;

import org.testng.annotations.Test;

/*
Run corresponding testng file to get below results from following path,
https://github.com/bipin-k/selenium/blob/master/src/test/java/example_27/testng.xml

Following will be the output when corresponding TestNG file will be executed,

Test Method 01 Executed!
Test Method 02 Executed!
Test Method 03 Executed!
Test Method 04 Executed!
Test Method 05 Executed!
Test Method 06 Executed!
Test Method 07 Executed!
Test Method 08 Executed!
Test Method 09 Executed!
Test Method 10 Executed!
 */

public class TestNGMethodsExecutionOrder {
    @Test

    public void Test_01(){
        System.out.println("Test Method 01 Executed!");
    }

    @Test

    public void Test_09(){
        System.out.println("Test Method 09 Executed!");
    }

    @Test

    public void Test_08(){
        System.out.println("Test Method 08 Executed!");
    }

    @Test

    public void Test_02(){
        System.out.println("Test Method 02 Executed!");
    }

    @Test

    public void Test_06(){
        System.out.println("Test Method 06 Executed!");
    }

    @Test

    public void Test_10(){
        System.out.println("Test Method 10 Executed!");
    }

    @Test

    public void Test_04(){
        System.out.println("Test Method 04 Executed!");
    }

    @Test

    public void Test_07(){
        System.out.println("Test Method 07 Executed!");
    }

    @Test

    public void Test_03(){
        System.out.println("Test Method 03 Executed!");
    }

    @Test

    public void Test_05(){
        System.out.println("Test Method 05 Executed!");
    }


}
