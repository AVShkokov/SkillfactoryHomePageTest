import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SkillfactoryHomePageList {
    private final WebDriver driver;

    public SkillfactoryHomePageList(WebDriver driver) {
        this.driver = driver;
    }

    public String getSkillfactoryHomePageListByClass(String list_name) {
        return driver.findElements(By.className(list_name)).getFirst().getText();
    }
}
