package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.interactions.Actions;
import pages.LacostePage;
import pages.LoginPage;
import pages.SeventhProductPage;
import utilities.Driver;

import java.util.Iterator;
import java.util.Set;

public class Task2_StepDefinition {

    LoginPage loginPage = new LoginPage();
    LacostePage lacostePage = new LacostePage();

    Actions action = new Actions(Driver.getDriver());

    SeventhProductPage seventhProductPage = new SeventhProductPage();

    @When("user hover over Cosmetic & Personal Care tab")
    public void user_hover_over_cosmetic_personal_care_tab() {

        action.moveToElement(lacostePage.cosmeticPersonalCare);

    }
    @When("user clicks on Perfume & Deodorant item")
    public void user_clicks_on_perfume_deodorant_item() {
        action.moveToElement(lacostePage.perfumeDeodorant);
        action.click().build().perform();
    }
    @When("user search for ‘Lacoste’ in Brand filter")
    public void user_search_for_lacoste_in_brand_filter() {
        lacostePage.searchBrandBox.sendKeys("Lacoste");
    }

    @And("user select Lacoste")
    public void userSelectLacoste() {
        lacostePage.brandCheckbox.click();
    }
    @When("user click 7th product on the search result page")
    public void user_click_7th_product_on_the_search_result_page() throws InterruptedException {
        System.out.println("Before click " + Driver.getDriver().getWindowHandle());
        lacostePage.seventhProduct.click();
        System.out.println("After click " + Driver.getDriver().getWindowHandle());
        Thread.sleep(5000);

    }
    @When("user add product to the ‘Favorites’")
    public void user_add_product_to_the_favorites() {

        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for (String windowHandle : windowHandles) {
            Driver.getDriver().switchTo().window(windowHandle);
        }
        seventhProductPage.addToFavoriteButton.click();
/*
        String parentWindow=Driver.getDriver().getWindowHandle();
        String childWin1="";
        String childWin2="";
        Set<String> windows=Driver.getDriver().getWindowHandles();
        Iterator<String> iterator=windows.iterator();
        childWin1=iterator.next();
        Driver.getDriver().switchTo().window(childWin1);

        System.out.println(childWin1);
        System.out.println(Driver.getDriver().getTitle());
*/
        /*
        Set<String> handles = Driver.getDriver().getWindowHandles();
        for (String handle : handles) {
            if(!handles.contains(handle))
                Driver.getDriver().switchTo().window(handle);
            System.out.println(handle);
        }
        System.out.println(Driver.getDriver().getTitle());

*/

/*
        Set<String> handlesSet = Driver.getDriver().getWindowHandles();
        Object[] handles = handlesSet.toArray();
        String childWin1= (String) handles[handles.length-1];
        Driver.getDriver().switchTo().window(childWin1);

        System.out.println(childWin1);
        System.out.println(Driver.getDriver().getTitle());
        */

/*
        handlesSet = Driver.getDriver().getWindowHandles();
        handles = handlesSet.toArray();
        String childWin2= (String) handles[handles.length-1];
        Driver.getDriver().switchTo().window(childWin2);
*/

        //action.moveToElement(seventhProductPage.addToFavoriteButton);
        //action.click().perform();
    }
    @When("user navigate to Favorites")
    public void user_navigate_to_favorites() {


    }
    @Then("verify the product title is the same as with the product details page")
    public void verify_the_product_title_is_the_same_as_with_the_product_details_page() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


}
