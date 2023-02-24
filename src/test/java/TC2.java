import org.testng.annotations.*;

public class TC2 {

    @BeforeTest
    void beforeTest()
    {
        System.out.println("This is beforeTest2......");
    }

    @AfterTest
    void afterTest()
    {
        System.out.println("This is afterTest2.....");
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
    void test3()
    {
        System.out.println("This is test3...");
    }

    @Test
    void test4()
    {
        System.out.println("This is test4.....");
    }
}
