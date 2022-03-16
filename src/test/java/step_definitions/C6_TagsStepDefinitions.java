package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;

public class C6_TagsStepDefinitions {

    @Then("user could select different tags")
    public void user_could_select_different_tags()
    {
        // Select a Product tag (1) //
        Hooks.driver.findElement(By.cssSelector("a[href=\"/awesome\"]")).click();
    }

    @And("logged user could find new products")
    public void logged_user_could_find_new_products()
    {
        
    }
}
