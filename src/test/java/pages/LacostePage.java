package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LacostePage {

    public LacostePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[title ='Kozmetik & Kişisel Bakım']")
    public WebElement cosmeticPersonalCare;

    @FindBy(css = "a[title='Parfüm & Deodorant']")
    public WebElement perfumeDeodorant;

}
