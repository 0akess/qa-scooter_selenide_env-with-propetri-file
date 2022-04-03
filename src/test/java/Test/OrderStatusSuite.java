package Test;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.ScooterPageObject.ManePage;
import ru.yandex.ScooterPageObject.OrderStatusPage;


import static com.codeborne.selenide.Selenide.*;

public class OrderStatusSuite {

    @BeforeTest
    public void settingsBrowser(){
//        System.setProperty("webdriver.geckodriver", "https://github.com/mozilla/geckodriver/releases");
//        System.setProperty("selenide.browser", "firefox");

        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);
        manePage.clickButtonAcceptCookie();

    }

    /** Тест проверяет, что поиск заказа, через поле "Поиск заказа" в хедере, с невалидным номером - провалится **/
    @Test
    public void searchStatusOrderInHeader(){

        OrderStatusPage orderStatus =
                open("https://qa-scooter.praktikum-services.ru",
                        OrderStatusPage.class);

        orderStatus.clickButtonOrderStatus()
                .setValueInputSearchNumberOrderInHeader("123")
                .clickButtonGoSearchNumberOrder()
                .isDisplayedImgNotFound();
    }

    /** Тест проверяет, что поиск заказа, через поле "Поиск заказа" на странице статус заказа,
     *  с невалидным номером - провалится **/
    @Test
    public void searchStatusOrderOnStatusOrderPage(){
        OrderStatusPage orderStatus =
                open("https://qa-scooter.praktikum-services.ru/track/",
                        OrderStatusPage.class);

        orderStatus.setValueInputSearchNumberOrderInOrderStatusPage("1234")
                .clickButtonWatchSearchNumberOrder()
                .isDisplayedImgNotFound();
    }

    /** Тест проверяет, что поиск заказа, через поле "Поиск заказа" на странице статус заказа,
     *  с использованием букв, вместо цифр - провалится **/
    @Test
    public void searchStatusOrderByLetters(){
        OrderStatusPage orderStatus =
                open("https://qa-scooter.praktikum-services.ru/track/",
                        OrderStatusPage.class);

        orderStatus.setValueInputSearchNumberOrderInOrderStatusPage("sdfsdf")
                .clickButtonWatchSearchNumberOrder()
                .isDisplayedImgNotFound();
    }

    /** Тест проверяет, что находясь на странице оформления заказа
     * и кликая на кнопку "Скутер", пользователь остается на главной **/
    @Test
    public void checkButtonScooterInPageOrderCreate(){

        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru/track/",
                        ManePage.class);

        manePage.clickButtonScooter()
                .isUrlIsManeScooter();
    }

    /** Тест проверяет, что находясь на странице оформления заказа и кликая на
     * кнопку "Яндекс", у пользователя открывается страница с Яндексом **/
    @Test
    public void checkButtonYandexInOrderStatusPage(){
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru/track/",
                        ManePage.class);

        manePage.clickButtonYandex();
        switchTo().window(1);
        manePage.isUrlIsYandex();
        switchTo().window(1).close();
        switchTo().window(0);
    }
}