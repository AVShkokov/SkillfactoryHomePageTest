import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SkillfactoryHomePageItem {
    private final WebDriver driver;

    public SkillfactoryHomePageItem(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSkillfactoryHomePageItemByXPath(String item_xpath) {
        return driver.findElement(By.xpath(item_xpath));
    }

    public WebElement getSkillfactoryHomePageItemBySelector(String item_selector) {
        return driver.findElement(By.cssSelector(item_selector));
    }
}
