package Test;

import org.testng.annotations.BeforeTest;
import ru.yandex.ScooterPageObject.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class CreateOrderSuite {

    @BeforeTest
    public void settingsBrowser() {

        /** Снимите коммент со строчек ниже, для того что бы запустить тест в Firefox **/
//        System.setProperty("webdriver.geckodriver", "https://github.com/mozilla/geckodriver/releases");
//        System.setProperty("selenide.browser", "firefox");

        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);

        manePage.clickButtonAcceptCookie();
    }

    @Test
    public void createOrderFromTheHeaderPositive() {

        CreateOrderPage makeOrder =
                open("https://qa-scooter.praktikum-services.ru",
                        CreateOrderPage.class);

        /** Шаг 1 - Открывается страница создания заказа **/
        makeOrder.clickButtonOrderScooter(0)

                /** Шаг 2 - заполняются все доступные поля на странице **/
                .setValueFirstNameInput("Иван")
                .setValueLastNameInput("Иванович")
                .setValueAddressInput("Георгич")
                .setValueMetroInput("Сокольники")
                .setValueNumberPhoneInput("89107521707")

                /** Шаг 3 - происходит нажатие на кнопку подтвердить.
                 * Открывается страница с новыми полями для аренды. **/
                .clickButtonNextStep()

                /** Шаг 4 - заполняются все доступные поля на странице **/
                .selectOtherDateDelivery("10.03.2022")
                .selectorRentalPeriod(6)
                .clickSelectColorForScooterBlack()
                .setValueInInputCommentForDelivery("гугл пусти")

                /** Шаг 5 - нажимает кнопку "Заказать" и создание заказа **/
                .clickCompleteOrder()
                .clickButtonYesPlaceAnOrder()

                /** Шаг 6 - проверяется, что заказ сделан **/
                .chekOrderCreatedSuccessful();
    }

    @Test
    public void createOrderFromTheMidlOfPagePositive() {

        CreateOrderPage makingOrder =
                open("https://qa-scooter.praktikum-services.ru",
                        CreateOrderPage.class);

        /** Шаг 1 - Открывается страница создания заказа **/
        makingOrder.clickButtonOrderScooter(1)

                /** Шаг 2 - заполняются все доступные поля на странице **/
                .setValueFirstNameInput("Артем")
                .setValueLastNameInput("Дудник")
                .setValueAddressInput("Игоревич")
                .setValueMetroInput("Технопарк")
                .setValueNumberPhoneInput("89172057433")

                /** Шаг 3 - происходит нажатие на кнопку подтвердить.
                 * Открывается страница с новыми полями для аренды. **/
                .clickButtonNextStep()

                /** Шаг 4 - заполняются все доступные поля на странице **/
                .selectOtherDateDelivery("02.02.2022")
                .selectorRentalPeriod(3)
                .clickSelectColorForScooterGrey()
                .setValueInInputCommentForDelivery("Пажалуйста")

                /** Шаг 5 - нажимает кнопку "Заказать" и создание заказа **/
                .clickCompleteOrder()
                .clickButtonNoPlaceAnOrder()
                .clickCompleteOrder()
                .clickButtonYesPlaceAnOrder()

                /** Шаг 6 - проверяется, что заказ сделан **/
                .chekOrderCreatedSuccessful();
    }

    /**
     * Тест проверяет, что если не заполнить поле Имя, и нажать "Далее"
     * появиться варнинг
     **/
    @Test
    public void checkErrorMassageForInputFirstNameNoData() {
        CreateOrderPage makingOrder =
                open("https://qa-scooter.praktikum-services.ru/",
                        CreateOrderPage.class);

        makingOrder.clickButtonOrderScooter(0)
                .clickButtonNextStep()
                .checkErrorFirstName();
    }

    /**
     * Тест проверяет, что если заполнить поле Имя символами не из кириллицы, и нажать "Далее"
     * появиться варнинг
     **/
    @Test
    public void checkErrorMassageForInputFirstNameInvalidValue() {
        CreateOrderPage makingOrder =
                open("https://qa-scooter.praktikum-services.ru/",
                        CreateOrderPage.class);

        makingOrder.clickButtonOrderScooter(0)
                .setValueFirstNameInput("ndsd123s")
                .clickButtonNextStep()
                .checkErrorFirstName();
    }

    /**
     * Тест проверяет, что если не заполнить поле Фамилия, и нажать "Далее"
     * появиться варнинг
     **/
    @Test
    public void checkErrorMassageForInputLastNameNoData() {
        CreateOrderPage makingOrder =
                open("https://qa-scooter.praktikum-services.ru/",
                        CreateOrderPage.class);

        makingOrder.clickButtonOrderScooter(0)
                .clickButtonNextStep()
                .checkErrorLastName();
    }

    /**
     * Тест проверяет, что если заполнить поле Фамилия символами не из кириллицы, и нажать "Далее"
     * появиться варнинг
     **/
    @Test
    public void checkErrorMassageForInputLastNameInvalidValue() {
        CreateOrderPage makingOrder =
                open("https://qa-scooter.praktikum-services.ru/",
                        CreateOrderPage.class);

        makingOrder.clickButtonOrderScooter(0)
                .setValueLastNameInput("ndsd123s")
                .clickButtonNextStep()
                .checkErrorLastName();
    }

    /**
     * Тест проверяет, что если заполнить поле Адрес символами не из кириллицы, и нажать "Далее"
     * появиться варнинг
     **/
    @Test
    public void checkErrorMassageForInputAddressInvalidValue() {
        CreateOrderPage makingOrder =
                open("https://qa-scooter.praktikum-services.ru/",
                        CreateOrderPage.class);

        makingOrder.clickButtonOrderScooter(0)
                .setValueAddressInput("ndsd123s")
                .clickButtonNextStep()
                .checkErrorAddress();
    }

    /**
     * Тест проверяет, что если не заполнить поле Фамилия, и нажать "Далее"
     * появиться варнинг
     **/
    @Test
    public void checkErrorMassageForInputMetroStationNoData() {
        CreateOrderPage makingOrder =
                open("https://qa-scooter.praktikum-services.ru/",
                        CreateOrderPage.class);

        makingOrder.clickButtonOrderScooter(0)
                .clickButtonNextStep()
                .checkErrorMetroStation();
    }

    /**
     * Тест проверяет, что если не заполнить поле Фамилия, и нажать "Далее"
     * появиться варнинг
     **/
    @Test
    public void checkErrorMassageForInputNumberPhoneNoData() {
        CreateOrderPage makingOrder =
                open("https://qa-scooter.praktikum-services.ru/",
                        CreateOrderPage.class);

        makingOrder.clickButtonOrderScooter(0)
                .clickButtonNextStep()
                .checkErrorNumberPhone();
    }

    /**
     * Тест проверяет, что если заполнить поле Фамилия символами не из кириллицы, и нажать "Далее"
     * появиться варнинг
     **/
    @Test
    public void checkErrorMassageForInputNumberPhoneInvalidValue() {
        CreateOrderPage makingOrder =
                open("https://qa-scooter.praktikum-services.ru/",
                        CreateOrderPage.class);

        makingOrder.clickButtonOrderScooter(0)
                .setValueNumberPhoneInput("ndsd123s")
                .clickButtonNextStep()
                .checkErrorNumberPhone();
    }

    /**
     * Тест проверяет, что находясь на странице проверки заказа по его номеру
     * и кликая на кнопку "Скутер", пользователь переходит на главную
     **/
    @Test
    public void checkButtonScooterInPageChekOrder() {
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru/order/",
                        ManePage.class);

        manePage.clickButtonScooter()
                .isUrlIsManeScooter();
    }

    /**
     * Тест проверяет, что находясь на главной странице и кликая на
     * кнопку "Яндекс", у пользователя открывается страница с Яндексом
     **/
    @Test
    public void checkButtonYandexInOrderCreatePage() {
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru/order",
                        ManePage.class);

        manePage.clickButtonYandex();
        switchTo().window(1);
        manePage.isUrlIsYandex();
        switchTo().window(1).close();
        switchTo().window(0);
    }
}