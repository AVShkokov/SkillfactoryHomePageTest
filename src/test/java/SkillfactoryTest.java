import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class SkillfactoryTest {
    private WebDriver driver;

    @BeforeEach
    public void installDriver() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void skillfactoryHomePageOpenTest() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);

        skillfactoryMainPage.skillfactoryOpenPage();
    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }
}
