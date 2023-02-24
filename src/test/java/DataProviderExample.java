import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {



    @Test(dataProvider = "data123", dataProviderClass = customerData.class)
    void loging(String email, String password)
    {
        System.out.println(email+"      "+password);
    }
}
