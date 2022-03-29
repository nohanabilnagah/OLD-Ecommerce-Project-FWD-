package step_definitions;

import Pages.P6_CategoriesPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.util.concurrent.TimeUnit;

public class C6_CategoriesStepDefinitions {

    P6_CategoriesPageElements category = Hooks.PageBase.p6_categoriesPageElementsPOM();

    @Given("logged user can select Random Category")
    public void select_random_Category() throws InterruptedException {
        // Select Random Category using POM //
        category.categoryRandomEle();
        Thread.sleep(2000);
    }
    //------------------------------------------------------------------------------//

    @Then("logged user could hover and open sub-Category")
    public void open_subCategory()
    {
        // Hover and open sub-Category from Category using POM //
        category.categorySubEle();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//