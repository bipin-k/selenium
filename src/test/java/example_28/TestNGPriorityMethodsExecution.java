package example_28;

import org.testng.annotations.Test;

/*
Run corresponding testng file to get below results from following path,
https://github.com/bipin-k/selenium/blob/master/src/test/java/example_28/testng.xml

Following will be the output when TestNG file is executed,
Test Method with priority 01 executed!
Test Method with priority 02 executed!
Test Method with priority 03 executed!
Test Method with priority 04 executed!
Test Method with priority 05 executed!
Test Method with priority 06 executed!
Test Method with priority 07 executed!
Test Method with priority 08 executed!
Test Method with priority 09 executed!
Test Method with priority 10 executed!
 */

public class TestNGPriorityMethodsExecution {

    @Test(priority = 1)

    public void priority_01(){
        System.out.println("Test Method with priority 01 executed!");
    }

    @Test(priority = 8)

    public void priority_08(){
        System.out.println("Test Method with priority 08 executed!");
    }

    @Test(priority = 2)

    public void priority_02(){
        System.out.println("Test Method with priority 02 executed!");
    }

    @Test(priority = 4)

    public void priority_04(){
        System.out.println("Test Method with priority 04 executed!");
    }

    @Test(priority = 10)

    public void priority_10(){
        System.out.println("Test Method with priority 10 executed!");
    }

    @Test(priority = 7)

    public void priority_07(){
        System.out.println("Test Method with priority 07 executed!");
    }

    @Test(priority = 9)

    public void priority_09(){
        System.out.println("Test Method with priority 09 executed!");
    }

    @Test(priority = 5)

    public void priority_05(){
        System.out.println("Test Method with priority 05 executed!");
    }

    @Test(priority = 3)

    public void priority_03(){
        System.out.println("Test Method with priority 03 executed!");
    }

    @Test(priority = 6)

    public void priority_06(){
        System.out.println("Test Method with priority 06 executed!");
    }
}
