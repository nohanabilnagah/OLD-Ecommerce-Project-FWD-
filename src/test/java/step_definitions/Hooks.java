package step_definitions;

import Pages.Page_Base;
import io.cucumber.java.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    static Page_Base PageBase;



    @BeforeAll
    public static void user_opens_chrome_browser()
    {
        // ***Select web driver to open browser*** //
        // Option_1 //
        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        // Option_2 //
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // Open home page and maximize (run in a browser resolution of 1024x768px) //
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        PageBase = new Page_Base(driver);

    }

    @AfterAll
    public static void user_closes_the_driver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
