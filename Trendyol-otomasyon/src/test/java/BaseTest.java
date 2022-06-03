import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest{

    protected WebDriver driver;


    @BeforeAll
    public void testSetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        HomePage homePage = new HomePage(driver);
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();
        homePage.modal();
    }

    @AfterAll
    public void afterMethod(){
        driver.quit();
    }
}
