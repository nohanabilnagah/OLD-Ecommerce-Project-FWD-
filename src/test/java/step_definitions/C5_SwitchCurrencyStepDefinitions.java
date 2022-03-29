package step_definitions;

import Pages.P5_SwitchCurrPageElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class C5_SwitchCurrencyStepDefinitions {

    P5_SwitchCurrPageElements switchCurr = Hooks.PageBase.p5_switchCurrPageElementsPOM();

    @Given("user selects a product")
    public void user_select_a_product() throws InterruptedException {
        // Select a product using POM //
        switchCurr.switchSelProdEle();
        Thread.sleep(2000);
    }
    //------------------------------------------------------------------------------//

    @When("user changes the currency")
    public void user_changes_the_currency() throws InterruptedException {
        // Change Currency using POM //
        switchCurr.switchCurrEle();
        Thread.sleep(2000);
    }
    //------------------------------------------------------------------------------//

    @Then("user could find the selected currency")
    public void find_the_selected_currency()
    {
        // Switch Currency Assertion using POM //
        switchCurr.switchAsserEle();
        System.out.println("Price of the product appears in Euro currency");
    }
    //------------------------------------------------------------------------------//
}
//------------------------------------------------------------------------------------------------------------//
