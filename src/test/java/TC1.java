import org.testng.annotations.*;

public class TC1 {

    @BeforeTest
    void beforeTest()
    {
        System.out.println("This is beforeTest1......");
    }

    @AfterTest
    void afterTest()
    {
        System.out.println("This is afterTest1.....");
    }

    @BeforeClass
    void beforeClass()
    {
        System.out.println("This is beforeClass............");
    }

    @AfterClass
    void afterClass()
    {
        System.out.println("This is afterClass......");
    }

    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This is beforeMethod.......");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This is afterMethod");
    }

    @Test
    void test1()
    {
        System.out.println("This is test1....");
    }

    @Test
    void test2()
    {
        System.out.println("This is test2.....");
    }
}
