import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{
    By addToBasketButtonLocator = By.cssSelector(".add-to-basket");
    By basketCountLocator = By.cssSelector(".basket-item-count-container ");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        return isDisplayed(addToBasketButtonLocator);
    }

    public void addToBasket() {
        click(addToBasketButtonLocator);
    }

    public boolean isCountUp() {
        waitForVisibilityOfElement(basketCountLocator, 5);
        return getBasketCount() > 0;
    }

    private int getBasketCount(){
        String count = find(basketCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void goToBasket() {
        click(basketCountLocator);
    }

}
