package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.LacostePage;
import pages.LoginPage;
import utilities.Driver;

public class Task2_StepDefinition {

    LoginPage loginPage = new LoginPage();
    LacostePage lacostePage = new LacostePage();

    @When("user hover over Cosmetic & Personal Care tab")
    public void user_hover_over_cosmetic_personal_care_tab() {
        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(lacostePage.cosmeticPersonalCare).perform();
    }
    @When("user clicks on Perfume & Deodorant item")
    public void user_clicks_on_perfume_deodorant_item() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user search for ‘Lacoste’ in Brand filter")
    public void user_search_for_lacoste_in_brand_filter() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user select {string}")
    public void user_select(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user click 7th product on the search result page")
    public void user_click_7th_product_on_the_search_result_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user add product to the ‘Favorites’")
    public void user_add_product_to_the_favorites() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user navigate to Favorites")
    public void user_navigate_to_favorites() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify the product title is the same as with the product details page")
    public void verify_the_product_title_is_the_same_as_with_the_product_details_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
