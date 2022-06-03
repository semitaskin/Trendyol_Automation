import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BasketPage extends BasePage{
    By productInBasketLocator = By.cssSelector(".pb-basket-item");

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductAdded() {
        waitForVisibilityOfElement(productInBasketLocator, 5);
        return productInBasket().size() > 0;
    }
    private List<WebElement> productInBasket(){
        return findAll(productInBasketLocator);
    }
}
