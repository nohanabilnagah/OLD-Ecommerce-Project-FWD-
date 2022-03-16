package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterSuite;

import java.util.concurrent.TimeUnit;

public class Hooks {
    static WebDriver driver;

    @Before
    public static void user_opens_chrome_browser()
    {
        // Select web driver to open browser //
        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe");
        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Open home page and maximize (run in a browser resolution of 1024x768px) //
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }


    @After
    public static void user_closes_the_driver() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
