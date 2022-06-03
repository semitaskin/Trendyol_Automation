import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_AddProductToCard extends BaseTest{
    HomePage homePage;
    ProductPage productPage;
    ProductDetailPage productDetailPage;
    BasketPage basketPage;

    @Test
    @Order(1)
    public void searchProduct(){
        homePage = new HomePage(driver);
        productPage = new ProductPage(driver);
        homePage.searchMethod("macbook pro 16");
        Assertions.assertTrue(productPage.isOnProductPage() ,
                            "not on product page!");
    }

    @Test
    @Order(2)
    public void selectProduct(){
        productDetailPage = new ProductDetailPage(driver);
        productPage.selectProduct(2);
        productPage.switchTabs(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage() ,
                                "not on product detail page! ");
    }


    @Test
    @Order(3)
    public void addToBasket(){
        productDetailPage.addToBasket();
        Assertions.assertTrue(productDetailPage.isCountUp() ,
                            "product count did not up!");
    }

    @Test
    @Order(4)
    public void goToBasket(){
        basketPage = new BasketPage(driver);
        productDetailPage.goToBasket();
        Assertions.assertTrue(basketPage.isProductAdded() ,
                            "product not added!");
    }

}
