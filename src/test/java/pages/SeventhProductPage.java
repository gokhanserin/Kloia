package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SeventhProductPage {

    public SeventhProductPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "addToFavouriteWishListBtn")
    public WebElement addToFavoriteButton;

    @FindBy(css = "h1[class='proName']")
    public WebElement productTitle;

    @FindBy(className = "iconFavoritesWhite")
    public WebElement favoritesButton;

    @FindBy(id = "shareWinTooltipClose")
    public WebElement shareWinClose;

    @FindBy(css = "div[class='lightBox toaster  toaster-success wishListToaster']")
    public WebElement lightBox;
}
