import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {

    WebDriver driver;
    @BeforeClass
    void setup() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test
    void logoCheck() throws InterruptedException {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
        Thread.sleep(5000);
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
    }

    @Test
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
