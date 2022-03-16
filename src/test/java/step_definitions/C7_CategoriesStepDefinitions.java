package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class C7_CategoriesStepDefinitions {

    @When("logged user selects Apparel Category and hover to open Shoes sub-Category")
    public void logged_user_selects_Category_and_hover_to_sub_Category()
    {
        Actions act = new Actions(Hooks.driver);
        act.moveToElement(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/a")))
                .moveToElement(Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[3]/ul/li[1]/a")))
                .click().build().perform();
    }

    @And("logged user could find Shoes products")
    public void logged_user_could_find_Shoes_products()
    {
        // Check that the product exists //
        System.out.println("Assertion: Shoes");
        Assert.assertTrue(Hooks.driver.findElement(By.cssSelector("h2[class=\"product-title\"] a")).isDisplayed());

//        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  //3
//        System.out.println(count);
//        Assert.assertTrue(count > 0);
//        ArrayList <String> sholist = new ArrayList<String>();
//
//        for (int x = 0; x < count ; x++) {
//            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
//            sholist.add(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
//            Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().contains("Adidas, Nike"));
//        }
//        System.out.println(sholist);
    }

}
