package step_definitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.Set;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();
    String mainHandle;

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        loginPage.loginButton.click();
    }
    @When("user clicks on facebook button")
    public void user_clicks_on_facebook_button() {
        loginPage.facebookButton.click();
    }
    @When("user enter email or phone number")
    public void user_enter_email_or_phone_number() {

        mainHandle = Driver.getDriver().getWindowHandle();

        Set<String> allWindowHandles = Driver.getDriver().getWindowHandles();
        for (String each: allWindowHandles){
            Driver.getDriver().switchTo().window(each);
        }
        loginPage.inputBoxEmail.sendKeys("penmudamu@gmail.com");
    }
    @When("user enter password")
    public void user_enter_password() {
        loginPage.inputBoxPassword.sendKeys("Saka2654.");
    }

    @And("user clicks on Facebook login button")
    public void userClicksOnFacebookLoginButton() {
        loginPage.facebookLogin.click();
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        Driver.getDriver().switchTo().window(mainHandle);
        Assert.assertTrue(loginPage.accountButton.isDisplayed());
    }

}
