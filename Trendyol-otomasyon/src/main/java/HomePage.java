import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    By modalLocator = By.id("Combined-Shape");
    By searchBoxLocator = By.cssSelector(".search-box");
    By searchButton = By.cssSelector(".search-icon");
    By suggestion = By.cssSelector(".suggestion");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void searchMethod(String text){
        type(searchBoxLocator , text);
        waitForVisibilityOfElement(suggestion , 5);
        click(searchButton);
    }

    public void modal(){
        click(modalLocator);
    }
}
