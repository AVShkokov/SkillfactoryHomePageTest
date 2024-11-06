import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SkillfactoryTest {
    private WebDriver driver;

    @BeforeEach
    public void installDriver() {
        //driver = new FirefoxDriver();
        driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1280, 768));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Test
    public void SkillfactoryHomePageOpenTest() {
        openPage();
    }

    @Test
    public void SkillfactoryHomePageTitleTest() {
        String title = "Онлайн-школа Skillfactory — онлайн-обучение востребованным IT-профессиям";

        openPage();

        SkillfactoryHomePageTitle home_page_title = new SkillfactoryHomePageTitle(driver);
        String title_for_test = home_page_title.getSkillfactoryHomePageTitle();

        System.out.println(title_for_test);
        assertEquals(title_for_test, title);
    }

    @Test
    public void SkillfactoryHomePageMainNaviTest() {
        String elements = "ОНЛАЙН-КУРСЫ\nБЕСПЛАТНО\nЦЕНТР КАРЬЕРЫ\nКОНТАКТЫ\nМЕДИА\nКОРПОРАТИВНОЕ ОБУЧЕНИЕ";
        String list_name = "main__nav";

        openPage();

        SkillfactoryHomePageList main_navi = new SkillfactoryHomePageList(driver);
        String elements_for_test = main_navi.getSkillfactoryHomePageListByClass(list_name);

        System.out.println(elements_for_test);
        assertEquals(elements_for_test, elements);
    }

    @Test
    public void SkillfactoryHomePageMainNaviItemLinkTest() {
        String item_name = "КОНТАКТЫ";
        String title = "Контакты школы по работе с данными Skillfactory";

        openPage();

        SkillfactoryHomePageLink main_navi_item_link = new SkillfactoryHomePageLink(driver);
        WebElement item_for_test = main_navi_item_link.getSkillfactoryHomePageLinkByText(item_name);
        item_for_test.click();

        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        String title_for_test = driver.getTitle();
        assertEquals(title_for_test, title);
    }

    @Test
    public void SkillfactoryHomePageMainNaviSubmenuItemLinkTest() {
        String item_name = "Тестирование";
        String title = "Курсы тестировщиков, обучение QA-инженеров с нуля";

        openPage();

        SkillfactoryHomePageLink main_navi_submenu_item_link = new SkillfactoryHomePageLink(driver);
        WebElement item_for_test = main_navi_submenu_item_link.getSkillfactoryHomePageLinkByText(item_name);
        item_for_test.click();

        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        String title_for_test = driver.getTitle();

        System.out.println(title_for_test);
        assertEquals(title_for_test, title);
    }

    @Test
    public void SkillfactoryHomePageDirectionsListTest() {
        String elements = "Программирование\n  Data Science\n  Аналитика данных\n  Тестирование\n  Высшее образование\n  Дизайн\n  Менеджмент\n  Все курсы";
        String list_name = "directions__list";

        openPage();

        SkillfactoryHomePageList directions_list = new SkillfactoryHomePageList(driver);
        String elements_for_test = directions_list.getSkillfactoryHomePageListByClass(list_name);

        System.out.println(elements_for_test);
        assertEquals(elements_for_test, elements);
    }

    @Test
    public void SkillfactoryHomePageDirectionsListLinkTest() {
        String item_name = "Все курсы";
        String title = "Онлайн-курсы: обучение IT-профессиям | 90+ курсов";

        openPage();

        SkillfactoryHomePageLink directions_list_link = new SkillfactoryHomePageLink(driver);
        WebElement item_for_test = directions_list_link.getSkillfactoryHomePageLinkByText(item_name);
        item_for_test.click();

        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        String title_for_test = driver.getTitle();

        System.out.println(title_for_test);
        assertEquals(title_for_test, title);
    }

    @Test
    public void SkillfactoryHomePageCoursesCardsItemNameTest() {
        String item_xpath = "//*[@id=\"START\"]/a/div[1]/h3";
        String name = "IT-специалист с нуля";

        openPage();

        SkillfactoryHomePageItem courses_cards_item_name = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = courses_cards_item_name.getSkillfactoryHomePageItemByXPath(item_xpath);
        String name_for_test = item_for_test.getText();

        System.out.println(name_for_test);
        assertEquals(name_for_test, name);
    }

    @Test
    public void SkillfactoryHomePageAllCoursesLinkTest() {
        String item_xpath = "//*[@id=\"rec713617003\"]/div/div/div/section/div/a";
        String title = "Онлайн-курсы: обучение IT-профессиям | 90+ курсов";

        openPage();

        SkillfactoryHomePageLink all_course_link = new SkillfactoryHomePageLink(driver);
        WebElement item_for_test = all_course_link.getSkillfactoryHomePageLinkByXPath(item_xpath);
        item_for_test.click();

        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        String title_for_test = driver.getTitle();

        System.out.println(title_for_test);
        assertEquals(title_for_test, title);
    }

    @Test
    public void SkillfactoryHomePageHigherEducationHeaderTest() {
        String item_xpath = "//*[@id=\"rec720455715\"]/div/div/div/section/div/h2";
        String name = "Помогаем получить высшее образование в IT — онлайн";

        openPage();

        SkillfactoryHomePageItem higher_education_header = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = higher_education_header.getSkillfactoryHomePageItemByXPath(item_xpath);
        String name_for_test = item_for_test.getText();

        System.out.println(name_for_test);
        assertEquals(name_for_test, name);
    }

    @Test
    public void SkillfactoryHomePageHigherEducationButtonLinkTest() {
        String item_name = "Выбрать программу";
        String title = "Курсы высшего образования онлайн от Skillfactory и ВУЗов России";

        openPage();

        SkillfactoryHomePageLink higher_education_button = new SkillfactoryHomePageLink(driver);
        WebElement item_for_test = higher_education_button.getSkillfactoryHomePageLinkByText(item_name);
        item_for_test.click();

        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        String title_for_test = driver.getTitle();

        System.out.println(title_for_test);
        assertEquals(title_for_test, title);
    }

    @Test
    public void SkillfactoryHomePageRentgenButtonLinkTest() {
        String item_name = "Участвовать";
        String title = "Выберите свою IT-профессию за 1 день со Skillfactory";

        openPage();

        SkillfactoryHomePageLink rentgen_button = new SkillfactoryHomePageLink(driver);
        WebElement item_for_test = rentgen_button.getSkillfactoryHomePageLinkByText(item_name);
        item_for_test.click();

        Object[] windowHandles = driver.getWindowHandles().toArray();
        driver.switchTo().window((String) windowHandles[1]);

        String title_for_test = driver.getTitle();

        System.out.println(title_for_test);
        assertEquals(title_for_test, title);
    }

    @AfterEach
    public void closeBrowser() {
        driver.close();
    }

    private void openPage() {
        SkillfactoryMainPage skillfactoryMainPage = new SkillfactoryMainPage(driver);

        skillfactoryMainPage.skillfactoryOpenPage();
    }
}
