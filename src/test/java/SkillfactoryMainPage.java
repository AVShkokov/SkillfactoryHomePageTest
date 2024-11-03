import org.openqa.selenium.WebDriver;

public class SkillfactoryMainPage {
    private final WebDriver driver;
    String url = "https://www.skillfactory.ru";

    public SkillfactoryMainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void skillfactoryOpenPage() {
        driver.get(url);
    }
}
