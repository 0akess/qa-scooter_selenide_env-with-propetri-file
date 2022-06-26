package Test;

import org.junit.jupiter.api.Test;
import ru.yandex.ScooterPageObject.OrderStatusPage;
import ru.yandex.data.Url;

import static com.codeborne.selenide.Selenide.page;

public class OrderStatusSuite extends BaseTest {

    private final OrderStatusPage orderStatusPage = page(OrderStatusPage.class);

    // Тест проверяет, что поиск заказа, через поле "Поиск заказа" в хедере, с невалидным номером - провалится
    @Test
    public void searchStatusOrderInHeader() {

        orderStatusPage
                .open(Url.MainPage)
                .clickButtonOrderStatus()
                .setValueInputSearchNumberOrderInHeader("123")
                .clickButtonGoSearchNumberOrder()
                .isDisplayedImgNotFound();
    }

    // Тест проверяет, что поиск заказа, через поле "Поиск заказа" на странице статус заказа,
    // с невалидным номером - провалится
    @Test
    public void searchStatusOrderOnStatusOrderPage() {

        orderStatusPage
                .open(Url.StatusPage)
                .setValueInputSearchNumberOrderInOrderStatusPage("1234")
                .clickButtonWatchSearchNumberOrder()
                .isDisplayedImgNotFound();
    }

    // Тест проверяет, что поиск заказа, через поле "Поиск заказа" на странице статус заказа,
    //с использованием букв, вместо цифр - провалится
    @Test
    public void searchStatusOrderByLetters() {

        orderStatusPage
                .open(Url.StatusPage)
                .setValueInputSearchNumberOrderInOrderStatusPage("sdfsdf")
                .clickButtonWatchSearchNumberOrder()
                .isDisplayedImgNotFound();
    }

    // Тест проверяет, что находясь на странице оформления заказа
    //и кликая на кнопку "Скутер", пользователь остается на главной
    @Test
    public void checkButtonScooterInPageOrderCreate() {

        orderStatusPage
                .open(Url.StatusPage)
                .clickButtonScooter()
                .urlIsManeScooter();
    }

    // Тест проверяет, что находясь на странице оформления заказа и кликая на
    // кнопку "Яндекс", у пользователя открывается страница с Яндексом
    @Test
    public void checkButtonYandexInOrderStatusPage() {

        orderStatusPage
                .open(Url.StatusPage)
                .clickButtonYandex()
                .isUrlIsYandex();
    }
}