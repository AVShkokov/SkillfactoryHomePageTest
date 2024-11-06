import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SkillfactoryHomePageLink {
    private final WebDriver driver;

    public SkillfactoryHomePageLink(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSkillfactoryHomePageLinkByText(String item_name) {
        return driver.findElement(By.linkText(item_name));
    }

    public WebElement getSkillfactoryHomePageLinkByXPath(String item_xpath) {
        return driver.findElement(By.xpath(item_xpath));
    }
}
