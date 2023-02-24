import org.testng.annotations.DataProvider;

public class customerData {

    @DataProvider(name = "data123")
    public Object[][] getData()
    {
        Object[][] data = {{"abc@gmail.com","abc"},{"123@gmail.com","123"},{"456@gmail.com","456"}};
        return data;
    }
}
