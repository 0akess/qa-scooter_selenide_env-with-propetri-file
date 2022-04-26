package Test;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import ru.yandex.ScooterPageObject.*;

import static com.codeborne.selenide.Selenide.open;

public class CreateOrderSuite {

    @BeforeAll
    static public void settingsBrowser() {

        // Снимите коммент со строчек ниже, для того что бы запустить тест в Firefox
//        System.setProperty("webdriver.geckodriver", "https://github.com/mozilla/geckodriver/releases");
//        System.setProperty("selenide.browser", "firefox");

        MainePage mainePage =
                open("https://qa-scooter.praktikum-services.ru",
                        MainePage.class);

        mainePage.clickButtonAcceptCookie();
    }

    @Test
    public void createOrderFromTheHeaderPositive() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru",
                        CreateOrderPage.class);

        makeOrder
                // Шаг 1 - Открывается страница создания заказа
                .clickButtonOrderScooter(0)

                // Шаг 2 - заполняются все доступные поля на странице
                .setValueFirstNameInput("Иван")
                .setValueLastNameInput("Иванович")
                .setValueAddressInput("Георгич")
                .setValueMetroInput("Сокольники")
                .setValueNumberPhoneInput("89107521707")

                // Шаг 3 - происходит нажатие на кнопку подтвердить.
                // Открывается страница с новыми полями для аренды.
                .clickButtonNextStep()

                // Шаг 4 - заполняются все доступные поля на странице
                .selectOtherDateDelivery("10.03.2022")
                .selectorRentalPeriod(6)
                .clickSelectColorForScooterBlack()
                .setValueInInputCommentForDelivery("гугл пусти")

                // Шаг 5 - нажимает кнопку "Заказать" и создание заказа
                .clickCompleteOrder()
                .clickButtonYesPlaceAnOrder()

                // Шаг 6 - проверяется, что заказ сделан
                .checkOrderCreatedSuccessful();
    }

    @Test
    public void createOrderFromTheMidlOfPagePositive() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru",
                        CreateOrderPage.class);

        makeOrder
                // Шаг 1 - Открывается страница создания заказа
                .clickButtonOrderScooter(1)

                // Шаг 2 - заполняются все доступные поля на странице
                .setValueFirstNameInput("Артем")
                .setValueLastNameInput("Дудник")
                .setValueAddressInput("Игоревич")
                .setValueMetroInput("Технопарк")
                .setValueNumberPhoneInput("89172057433")

                // Шаг 3 - происходит нажатие на кнопку подтвердить.
                // Открывается страница с новыми полями для аренды.
                .clickButtonNextStep()

                // Шаг 4 - заполняются все доступные поля на странице
                .selectOtherDateDelivery("02.02.2022")
                .selectorRentalPeriod(3)
                .clickSelectColorForScooterGrey()
                .setValueInInputCommentForDelivery("Пажалуйста")

                // Шаг 5 - нажимает кнопку "Заказать" и создание заказа
                .clickCompleteOrder()
                .clickButtonNoPlaceAnOrder()
                .clickCompleteOrder()
                .clickButtonYesPlaceAnOrder()

                // Шаг 6 - проверяется, что заказ сделан
                .checkOrderCreatedSuccessful();
    }

    //Тест проверяет, что если не заполнить поле Имя, и нажать "Далее" появиться варнинг
    @Test
    public void checkErrorMassageForInputFirstNameNoData() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru/order",
                        CreateOrderPage.class);

        makeOrder.clickButtonNextStep()
                .checkErrorFirstName();
    }

    // Тест проверяет, что если заполнить поле Имя символами не из кириллицы, и нажать "Далее"
    // появиться варнинг
    @Test
    public void checkErrorMassageForInputFirstNameInvalidValue() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru/order",
                        CreateOrderPage.class);

        makeOrder.setValueFirstNameInput("ndsd123s")
                .clickButtonNextStep()
                .checkErrorFirstName();
    }

    // Тест проверяет, что если не заполнить поле Фамилия, и нажать "Далее"
    // появиться варнинг
    @Test
    public void checkErrorMassageForInputLastNameNoData() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru/order",
                        CreateOrderPage.class);

        makeOrder.clickButtonNextStep()
                .checkErrorLastName();
    }

    // Тест проверяет, что если заполнить поле Фамилия символами не из кириллицы, и нажать "Далее"
    // появиться варнинг
    @Test
    public void checkErrorMassageForInputLastNameInvalidValue() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru/order",
                        CreateOrderPage.class);

        makeOrder.setValueLastNameInput("ndsd123s")
                .clickButtonNextStep()
                .checkErrorLastName();
    }

    // Тест проверяет, что если заполнить поле Адрес символами не из кириллицы, и нажать "Далее"
    // появиться варнинг
    @Test
    public void checkErrorMassageForInputAddressInvalidValue() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru/order",
                        CreateOrderPage.class);

        makeOrder.setValueAddressInput("ndsd123s")
                .clickButtonNextStep()
                .checkErrorAddress();
    }

    // Тест проверяет, что если не заполнить поле Фамилия, и нажать "Далее" появиться варнинг
    @Test
    public void checkErrorMassageForInputMetroStationNoData() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru/order",
                        CreateOrderPage.class);

        makeOrder.clickButtonNextStep()
                .checkErrorMetroStation();
    }

    // Тест проверяет, что если не заполнить поле Фамилия, и нажать "Далее" появиться варнинг
    @Test
    public void checkErrorMassageForInputNumberPhoneNoData() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru/order",
                        CreateOrderPage.class);

        makeOrder.clickButtonNextStep()
                .checkErrorNumberPhone();
    }

    // Тест проверяет, что если заполнить поле Фамилия символами не из кириллицы, и нажать "Далее"
    //появиться варнинг
    @Test
    public void checkErrorMassageForInputNumberPhoneInvalidValue() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru/order",
                        CreateOrderPage.class);

        makeOrder.setValueNumberPhoneInput("ndsd123s")
                .clickButtonNextStep()
                .checkErrorNumberPhone();
    }

    // Тест проверяет, что находясь на странице создания заказа
    // и кликая на кнопку "Скутер", пользователь переходит на главную
//    @Test
    public void checkButtonScooterInPageCheckOrder() {

        MainePage mainePage =
                open("https://qa-scooter.praktikum-services.ru/",
                        MainePage.class);

        mainePage.clickButtonScooter()
                .urlIsManeScooter();
    }

    //Тест проверяет, что находясь на странице оформления заказа и кликая на
    // кнопку "Яндекс", у пользователя открывается страница с Яндексом
//    @Test
    public void checkButtonYandexInOrderCreatePage() {

        MainePage mainePage =
                open("https://qa-scooter.praktikum-services.ru/",
                        MainePage.class);

        mainePage.clickButtonYandex()
                .isUrlIsYandex();

    }
}