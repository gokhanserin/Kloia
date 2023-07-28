package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FavoritesPage {

    public FavoritesPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
