package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.ArrayList;

public class C4_SearchStepDefinitions {


    @When("logged user clicks on search field")
    public void logged_user_clicks_on_search_field()
    {
        // Locate search field and click on it //
        Hooks.driver.findElement(By.id("small-searchterms")).click();
    }

    @And("logged user searches with name of product")
    public void logged_user_searches_with_name_of_product()
    {
        // Search for a product //
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("HTC");
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();
    }

    @Then("logged user could find relative results")
    public void logged_user_could_find_relative_results()
    {
        // Check that the product exists //
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  //2
        System.out.println(count);
        Assert.assertTrue(count > 0);
        ArrayList <String> prodlist = new ArrayList<String>();

        for (int x = 0; x < count ; x++) {
        System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            prodlist.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
        Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().toUpperCase().contains("HTC"));
        }
        System.out.println(prodlist);
    }


}
