package Test;


import org.junit.jupiter.api.Test;
import ru.yandex.ScooterPageObject.MainePage;
import ru.yandex.ScooterPageObject.OrderTrackPage;

import static com.codeborne.selenide.Selenide.open;

public class OrderStatusSuite {

    // Тест проверяет, что поиск заказа, через поле "Поиск заказа" в хедере, с невалидным номером - провалится
    @org.junit.jupiter.api.Test
    public void searchStatusOrderInHeader(){

        OrderTrackPage orderStatus =
                open("https://qa-scooter.praktikum-services.ru",
                        OrderTrackPage.class);

        orderStatus.clickButtonOrderStatus()
                .setValueInputSearchNumberOrderInHeader("123")
                .clickButtonGoSearchNumberOrder()
                .isDisplayedImgNotFound();
    }

    // Тест проверяет, что поиск заказа, через поле "Поиск заказа" на странице статус заказа,
    // с невалидным номером - провалится
    @Test
    public void searchStatusOrderOnStatusOrderPage(){

        OrderTrackPage orderStatus =
                open("https://qa-scooter.praktikum-services.ru/track",
                        OrderTrackPage.class);

        orderStatus.setValueInputSearchNumberOrderInOrderStatusPage("1234")
                .clickButtonWatchSearchNumberOrder()
                .isDisplayedImgNotFound();
    }

    // Тест проверяет, что поиск заказа, через поле "Поиск заказа" на странице статус заказа,
    //с использованием букв, вместо цифр - провалится
    @Test
    public void searchStatusOrderByLetters(){

        OrderTrackPage orderStatus =
                open("https://qa-scooter.praktikum-services.ru/track",
                        OrderTrackPage.class);

        orderStatus.setValueInputSearchNumberOrderInOrderStatusPage("sdfsdf")
                .clickButtonWatchSearchNumberOrder()
                .isDisplayedImgNotFound();
    }

    // Тест проверяет, что находясь на странице оформления заказа
    //и кликая на кнопку "Скутер", пользователь остается на главной
//    @Test
    public void checkButtonScooterInPageOrderCreate(){

        MainePage mainePage =
                open("https://qa-scooter.praktikum-services.ru/track",
                        MainePage.class);

        mainePage.clickButtonScooter()
                .urlIsManeScooter();
    }

    // Тест проверяет, что находясь на странице оформления заказа и кликая на
    // кнопку "Яндекс", у пользователя открывается страница с Яндексом
//    @Test
    public void checkButtonYandexInOrderStatusPage(){

        MainePage mainePage =
                open("https://qa-scooter.praktikum-services.ru/track",
                        MainePage.class);

        mainePage.clickButtonYandex()
                .isUrlIsYandex();
    }
}