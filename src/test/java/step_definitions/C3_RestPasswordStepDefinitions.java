package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class C3_RestPasswordStepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page()
    {
        Hooks.driver.findElement(By.linkText("Log in")).click();
    }

    @When("user clicks on forgot password")
    public void user_clicks_on_forgot_password()
    {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();
    }

    @And("user enters his email address to reset password")
    public void user_enters_his_email_address_to_reset_password()
    {
        Hooks.driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        Hooks.driver.findElement(By.cssSelector("input.email")).click();
        Hooks.driver.findElement(By.cssSelector("input.email")).clear();
        Hooks.driver.findElement(By.cssSelector("input.email")).sendKeys("noha.nabil83@gmail.com");
    }

    @Then("user clicks on recover button")
    public void user_clicks_on_recover_button()
    {
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]")).click();
    }

    @And("user gets a displayed message")
    public void user_gets_a_displayed_message() throws InterruptedException {
        Thread.sleep(2000);

        String expectedResult = "Email with instructions has been sent to you.";
        String actualResult = Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
        System.out.println("Email with instructions has been sent to you.");
    }

}
