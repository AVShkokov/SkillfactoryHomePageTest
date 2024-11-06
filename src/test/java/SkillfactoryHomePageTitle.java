import org.openqa.selenium.WebDriver;

public class SkillfactoryHomePageTitle {
    private final WebDriver driver;

    public SkillfactoryHomePageTitle(WebDriver driver) {
        this.driver = driver;
    }

    public String getSkillfactoryHomePageTitle() {
        return driver.getTitle();
    }
}
