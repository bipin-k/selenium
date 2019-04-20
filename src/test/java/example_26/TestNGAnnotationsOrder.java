package example_26;

import org.testng.annotations.*;

/*

Run corresponding testng file to get below results from following path,
https://github.com/bipin-k/selenium/blob/master/src/test/java/example_26/testng.xml

The Order of execution will be,
@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod
@Test
@AfterMethod
@AfterClass
@AfterTest
@AfterSuite
 */

public class TestNGAnnotationsOrder {
    @BeforeSuite

    public void beforeSuite(){
        System.out.println("@BeforeSuite");
    }

    @BeforeTest

    public void beforeTest(){
        System.out.println("@BeforeTest");
    }

    @BeforeClass

    public void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @BeforeMethod

    public void beforeMethod(){
        System.out.println("@BeforeMethod");
    }

    @Test

    public void test(){
        System.out.println("@Test");
    }

    @AfterMethod

    public void afterMethod(){
        System.out.println("@AfterMethod");
    }

    @AfterClass

    public void afterClass(){
        System.out.println("@AfterClass");
    }

    @AfterTest

    public void afterTest(){
        System.out.println("@AfterTest");
    }

    @AfterSuite

    public void afterSuite(){
        System.out.println("@AfterSuite");
    }
}
