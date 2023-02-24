import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
    @Test(priority = 1)
    void setup()
    {
        System.out.println("Opening Browser");
    }

    @Test(priority = 2)
    void searchCustomer()
    {
        System.out.println("Search Customer");
    }

    @Test(priority = 3)
    void addCustomer()
    {
        System.out.println("Add Customer");
        Assert.assertEquals(1,2);
    }

    @Test(priority = 4)
    void teardown()
    {
        System.out.println("Closing Browser");
    }
}
