package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FooterPage {

    public FooterPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(className = "fMenu")
    public WebElement footer;

    @FindBy(css = "a[title='Marka Koruma Merkezi']")
    public WebElement markaKoruma;

    @FindBy(css = "a[title='Markalar']")
    public WebElement brands;

}
