import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;


public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement find (By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findAll(By locator){
        return driver.findElements(locator);
    }

    public void click(By locator){
        find(locator).click();
    }
    public void type(By locator , String text){
        find(locator).sendKeys(text);
    }
    public boolean isDisplayed(By locator){
        return find(locator).isDisplayed();
    }

    public void switchTabs(int i){
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(i));
    }

    public void waitForVisibilityOfElement(By locator , int i){
        WebDriverWait wait = new WebDriverWait(driver , i);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}
