package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FavoritesPage {

    public FavoritesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "h3[class='productName']")
    public WebElement productItemFav;

}
