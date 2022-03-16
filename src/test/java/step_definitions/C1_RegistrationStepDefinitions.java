package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class C1_RegistrationStepDefinitions {

    @Given("new user launch registration page")
    public void new_user_launch_registration_page()
    {
        // Register as new user //
        Hooks.driver.findElement(By.linkText("Register")).click();
    }
    //------------------------------------------------------------------------------//

    @When("new user fills registration form with valid data")
    public void new_user_fills_registration_form_with_valid_data() {
        // Fill valid Name and Last Name //
        Hooks.driver.findElement(By.id("gender-female")).click();

        Hooks.driver.findElement(By.id("FirstName")).click();
        Hooks.driver.findElement(By.id("FirstName")).clear();
        Hooks.driver.findElement(By.id("FirstName")).sendKeys("Noha");

        Hooks.driver.findElement(By.id("LastName")).click();
        Hooks.driver.findElement(By.id("LastName")).clear();
        Hooks.driver.findElement(By.id("LastName")).sendKeys("Nabil");

        // Select Day from Value //
        Select selday = new Select(Hooks.driver.findElement(By.name("DateOfBirthDay"))); //Create object of the Select class
        selday.selectByValue("12"); //Select the option using with value
        // Select Month from VisibleText
        Select selmon = new Select(Hooks.driver.findElement(By.name("DateOfBirthMonth")));
        selmon.selectByVisibleText("March"); //Select the option using visible text
        // Select Year from Value
        Select selyear = new Select(Hooks.driver.findElement(By.name("DateOfBirthYear")));
        selyear.selectByValue("1983");

        // Write valid Email //
        Hooks.driver.findElement(By.id("Email")).click();
        Hooks.driver.findElement(By.id("Email")).clear();
        Hooks.driver.findElement(By.id("Email")).sendKeys("noha.nabil83@gmail.com");

        // Write Company Name //
        Hooks.driver.findElement(By.xpath("//input[@name=\"Company\"]")).click();
        Hooks.driver.findElement(By.xpath("//input[@name=\"Company\"]")).clear();
        Hooks.driver.findElement(By.xpath("//input[@name=\"Company\"]")).sendKeys("Embassy of Panama");

        // Uncheck Newsletter
        Hooks.driver.findElement(By.xpath("//label[@for=\"Newsletter\"]")).click();

        // Write and confirm Password //
        Hooks.driver.findElement(By.id("Password")).click();
        Hooks.driver.findElement(By.id("Password")).clear();
        Hooks.driver.findElement(By.id("Password")).sendKeys("123456");

        Hooks.driver.findElement(By.id("ConfirmPassword")).click();
        Hooks.driver.findElement(By.id("ConfirmPassword")).clear();
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
    }
        //------------------------------------------------------------------------------//

        @And("new user could register")
        public void new_user_could_register()
        {
            //Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(Keys.ENTER);
            Hooks.driver.findElement(By.id("register-button")).click();
        }
        //------------------------------------------------------------------------------//

    @Then("a success message is displayed")
    public void a_success_message_is_displayed()
    {
        System.out.println("Assertion: Your registration completed");
        Assert.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());

        String expectedResult = "Your registration completed";
        String actualResult = Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("Your registration completed");
    }
    //------------------------------------------------------------------------------//

}
