import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

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
        String item_xpath = "/html/body/div[4]/div/div/div/section/div/h2";
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

    @Test
    public void SkillfactoryHomePageNameFieldPlaceholderTest() {
        String item_selector = "#form625408054>div.t-form__inputsbox>div.t-input-group.t-input-group_nm>div>input";
        String placeholder = "Имя";

        openPage();

        SkillfactoryHomePageItem name_field_placeholder = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = name_field_placeholder.getSkillfactoryHomePageItemBySelector(item_selector);
        String placeholder_for_test = item_for_test.getAttribute("placeholder");

        System.out.println(placeholder_for_test);
        assertEquals(placeholder_for_test, placeholder);
    }

    @Test
    public void SkillfactoryHomePageEmailFieldPlaceholderTest() {
        String item_selector = "#form625408054>div.t-form__inputsbox>div.t-input-group.t-input-group_em>div>input";
        String placeholder = "Почта";

        openPage();

        SkillfactoryHomePageItem name_field_placeholder = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = name_field_placeholder.getSkillfactoryHomePageItemBySelector(item_selector);
        String placeholder_for_test = item_for_test.getAttribute("placeholder");

        System.out.println(placeholder_for_test);
        assertEquals(placeholder_for_test, placeholder);
    }

    @Test
    public void SkillfactoryHomePagePhoneFieldPlaceholderTest() {
        String item_selector = "#input_1676828667932";
        String placeholder = "(999) 999-99-99";

        openPage();

        SkillfactoryHomePageItem name_field_placeholder = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = name_field_placeholder.getSkillfactoryHomePageItemBySelector(item_selector);
        String placeholder_for_test = item_for_test.getAttribute("placeholder");

        System.out.println(placeholder_for_test);
        assertEquals(placeholder_for_test, placeholder);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Anton", "Антон", "Y", "Ю", "Иван Иванов", "Д'Артаньян"})
    public void SkillfactoryHomePageNameFieldPositiveInputTest(String argument) {
        String item_selector = "#form625408054>div.t-form__inputsbox>div.t-input-group.t-input-group_nm>div>input";
        String item_selector_with_error = "/html/body/div[16]/div/div/div[7]/div[1]/form/div[2]/div[1]/div/div";
        String button_selector = "#form625408054>div.t-form__inputsbox>div.tn-form__submit>button";

        openPage();

        SkillfactoryHomePageItem name_field_input = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(item_selector);
        item_for_test.clear();
        item_for_test.sendKeys(argument);

        WebElement button_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(button_selector);
        button_for_test.click();

        WebElement item_with_error = name_field_input.getSkillfactoryHomePageItemByXPath(item_selector_with_error);
        String message = item_with_error.getText();

        System.out.println(message);
        assertTrue(message.isBlank());
    }

    @ParameterizedTest
    @ValueSource(strings = {"4nton", "Ант0н", "1", "@", "", " "})
    public void SkillfactoryHomePageNameFieldNegativeInputTest(String argument) {
        String item_selector = "#form625408054>div.t-form__inputsbox>div.t-input-group.t-input-group_nm>div>input";
        String item_selector_with_error = "/html/body/div[16]/div/div/div[7]/div[1]/form/div[2]/div[1]/div/div";
        String button_selector = "#form625408054>div.t-form__inputsbox>div.tn-form__submit>button";

        openPage();

        SkillfactoryHomePageItem name_field_input = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(item_selector);
        item_for_test.clear();
        item_for_test.sendKeys(argument);

        WebElement button_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(button_selector);
        button_for_test.click();

        WebElement item_with_error = name_field_input.getSkillfactoryHomePageItemByXPath(item_selector_with_error);
        String message = item_with_error.getText();

        System.out.println(message);
        assertFalse(message.isBlank());
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@email.ru", "TEST@EMAIL.RU", "test1@email.ru", "1test@email.ru", "test@email1.ru", "te-st@email.ru", "test@e-mail.ru", "t_est@email.ru", "t.est@email.ru"})
    public void SkillfactoryHomePageEmailFieldPositiveInputTest(String argument) {
        String item_selector = "#form625408054>div.t-form__inputsbox>div.t-input-group.t-input-group_em>div>input";
        String item_selector_with_error = "/html/body/div[16]/div/div/div[7]/div[1]/form/div[2]/div[2]/div/div";
        String button_selector = "#form625408054>div.t-form__inputsbox>div.tn-form__submit>button";

        openPage();

        SkillfactoryHomePageItem name_field_input = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(item_selector);
        item_for_test.clear();
        item_for_test.sendKeys(argument);

        WebElement button_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(button_selector);
        button_for_test.click();

        WebElement item_with_error = name_field_input.getSkillfactoryHomePageItemByXPath(item_selector_with_error);
        String message = item_with_error.getText();

        System.out.println(message);
        assertTrue(message.isBlank());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "test@emailru", "testemail.ru", "testemailru", "t est@email.ru", "test@e mail.ru", "test@e_mail.ru", "test@email..ru"})
    public void SkillfactoryHomePageEmailFieldNegativeInputTest(String argument) {
        String item_selector = "#form625408054>div.t-form__inputsbox>div.t-input-group.t-input-group_em>div>input";
        String item_selector_with_error = "/html/body/div[16]/div/div/div[7]/div[1]/form/div[2]/div[2]/div/div";
        String button_selector = "#form625408054>div.t-form__inputsbox>div.tn-form__submit>button";

        openPage();

        SkillfactoryHomePageItem name_field_input = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(item_selector);
        item_for_test.clear();
        item_for_test.sendKeys(argument);

        WebElement button_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(button_selector);
        button_for_test.click();

        WebElement item_with_error = name_field_input.getSkillfactoryHomePageItemByXPath(item_selector_with_error);
        String message = item_with_error.getText();

        System.out.println(message);
        assertFalse(message.isBlank());
    }

    @ParameterizedTest
    @ValueSource(strings = {"9111111111", "8121111111", "495-111-11-11", "495 111-11-11", "495 111-11-11"})
    public void SkillfactoryHomePagePhoneFieldPositiveInputTest(String argument) {
        String item_selector = "#input_1676828667932";
        String item_selector_with_error = "/html/body/div[16]/div/div/div[7]/div[1]/form/div[2]/div[3]/div/div[2]";
        String button_selector = "#form625408054>div.t-form__inputsbox>div.tn-form__submit>button";

        openPage();

        SkillfactoryHomePageItem name_field_input = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(item_selector);
        item_for_test.clear();
        item_for_test.sendKeys(argument);

        WebElement button_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(button_selector);
        button_for_test.click();

        WebElement item_with_error = name_field_input.getSkillfactoryHomePageItemByXPath(item_selector_with_error);
        String message = item_with_error.getText();

        System.out.println(message);
        assertTrue(message.isBlank());
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "!", "a", "1111111111", "1"})
    public void SkillfactoryHomePagePhoneFieldNegativeInputTest(String argument) {
        String item_selector = "#input_1676828667932";
        String item_selector_with_error = "/html/body/div[16]/div/div/div[7]/div[1]/form/div[2]/div[3]/div/div[2]";
        String button_selector = "#form625408054>div.t-form__inputsbox>div.tn-form__submit>button";

        openPage();

        SkillfactoryHomePageItem name_field_input = new SkillfactoryHomePageItem(driver);
        WebElement item_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(item_selector);
        item_for_test.clear();
        item_for_test.sendKeys(argument);

        WebElement button_for_test = name_field_input.getSkillfactoryHomePageItemBySelector(button_selector);
        button_for_test.click();

        WebElement item_with_error = name_field_input.getSkillfactoryHomePageItemByXPath(item_selector_with_error);
        String message = item_with_error.getText();

        System.out.println(message);
        assertFalse(message.isBlank());
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
