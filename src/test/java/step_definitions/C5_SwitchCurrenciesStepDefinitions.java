package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class C5_SwitchCurrenciesStepDefinitions {
    @And("user selects a product")
    public void user_select_a_product()
    {
        // Select a product //
        Hooks.driver.findElement(By.cssSelector("a[href=\"/htc-one-mini-blue\"]")).click();
    }

    @And("user changes the currency")
    public void user_changes_the_currency() throws InterruptedException {
        Thread.sleep(2000);
        // Create object of the Select class //
        Select selcurr = new Select(Hooks.driver.findElement(By.id("customerCurrency")));
        selcurr.selectByValue("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fhtc-one-mini-blue"); //Select the option using with value
        // Assertion //
        Thread.sleep(2000);
        System.out.println("Price of the product appears in Euro currency");
        Assert.assertTrue(Hooks.driver.findElement(By.id("price-value-19")).isDisplayed());
    }
}
