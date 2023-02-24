import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    WebDriver driver;
    @BeforeClass
    @Parameters({"browser","url"})
    void setup(String browser, String url) throws InterruptedException {
        Assert.assertEquals(browser,"chrome");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test(priority = 1)
    void logoCheck() throws InterruptedException {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
        Thread.sleep(5000);
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
    }

    @Test(priority = 2)
    void titleCheck()
    {
        String title = driver.getTitle();
        Assert.assertEquals(title,"OrangeHRM1", "Title not matched");
    }

    @AfterClass
    void teardown()
    {
        driver.quit();
    }
}
