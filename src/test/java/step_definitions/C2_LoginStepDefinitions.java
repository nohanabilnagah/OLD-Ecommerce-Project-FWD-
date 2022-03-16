package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class C2_LoginStepDefinitions {

    @Given("user navigates to login page")
    public void user_navigates_to_login_page()
    {
        Hooks.driver.findElement(By.linkText("Log in")).click();
    }

    @When("user login with valid email and password")
    public void user_login_with_valid_email_and_password()
    {
        Hooks.driver.findElement(By.id("Email")).click();
        Hooks.driver.findElement(By.id("Email")).clear();
        Hooks.driver.findElement(By.id("Email")).sendKeys("noha.nabil83@gmail.com");

        Hooks.driver.findElement(By.id("Password")).click();
        Hooks.driver.findElement(By.id("Password")).clear();
        Hooks.driver.findElement(By.id("Password")).sendKeys("123456");
    }

    @And("user press on login button")
    public void user_press_on_login_button() throws InterruptedException {
        Hooks.driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
        //Hooks.driver.findElement(By.className("button-1 login-button")).click();
    }

    @Then("user could login successfully")
    public void user_could_login_successfully() {

        System.out.println("Assertion: User logged successfully");
        Assert.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());


//        //** Hard Assertion//
//
        // First Assertion
//        System.out.println("First Assertion");
//        Assert.assertEquals(actualResult.contains(expectedResult), true);
//        Assert.assertTrue(actualResult.contains(expectedResult));
//
//        // Second Assertion
//        System.out.println("Second Assertion");
//        Assert.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());


//        //** Soft Assertion
//        SoftAssert soft = new SoftAssert();
//
//        // First Assertion
//        System.out.println("First Assertion");
//        soft.assertEquals(actualResult.contains(expectedResult), true, "First Assertion Equal");
//        soft.assertTrue(actualResult.contains(expectedResult), "First Assertion True");
//
//        // Second Assertion
//        System.out.println("Second Assertion");
//        soft.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed(), "Second Assertion");
//
//        // Assert All
//        soft.assertAll();
    }


}
