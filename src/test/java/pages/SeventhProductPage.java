package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SeventhProductPage {

    public SeventhProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "a[data-skuid='127194819764']")
    public WebElement addToFavoriteButton;

    @FindBy(css = "h1[class='proName']")
    public WebElement productTitle;

    @FindBy(className = "iconFavoritesWhite")
    public WebElement favoritesButton;
}
