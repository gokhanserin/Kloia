package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
}

    @FindBy(css = "a[class='btnSignIn']")
    public WebElement loginButton;

    @FindBy(css = "div[class='facebook_large medium facebookBtn  btnLogin']")
    public WebElement facebookButton;

    @FindBy(css = "input[type='text']")
    public WebElement inputBoxEmail;

    @FindBy(id = "pass")
    public WebElement inputBoxPassword;

    @FindBy(css = "input[name='login']")
    public WebElement facebookLogin;

    @FindBy(css = "a[title='Hesabım']")
    public WebElement accountButton;

}
