import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends BasePage{

    By sortLocator = By.cssSelector(".sort-fltr-cntnr");
    By productLocator = By.cssSelector(".prdct-desc-cntnr-name");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage(){
        return isDisplayed(sortLocator);
    }

    public void selectProduct(int i) {
        getAllProducts().get(i).click();
    }

    private List<WebElement> getAllProducts(){
        return findAll(productLocator);
    }
}
