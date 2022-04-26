package ru.yandex.ScooterPageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainePage extends Base_URL {

    @FindBy(how = How.CLASS_NAME, using = "App_CookieConsent__1yUIN")
    private SelenideElement cookieConsent;

    @FindBy(how = How.LINK_TEXT, using = "И здесь куки! В общем, мы их используем.")
    private SelenideElement cookieText;

    @FindBy(how = How.XPATH, using = "//button[text()='да все привыкли']")
    private SelenideElement buttonAcceptCookie;

    @FindBy(how = How.LINK_TEXT, using = "Учебный тренажер")
    private SelenideElement headerDisclaimerTrainingSimulator;

    @FindBy(how = How.XPATH, using = "//*[text()='Самокат ']/parent::*/child::" +
            "div[@class='Home_Header__iJKdX']/text()[2]")
    private SelenideElement headerManeScooter;

    @FindBy(how = How.XPATH, using = "//*[text()='Привезём его прямо к вашей двери,']/parent::*" +
            "/child::div[@class='Home_SubHeader__zwi_E']/text()[2]")
    private SelenideElement subHeaderOne;

    @FindBy(how = How.LINK_TEXT, using = "Он лёгкий и с мощными колёсами— самое то, " +
            "чтобы ехать по набережной и нежно барабанить пальцами по рулю")
    private SelenideElement subHeaderTwo;

    @FindBy(how = How.XPATH, using = "//button[text()='Статус заказа']" +
            "/preceding-sibling::button[text()='Заказать']")
    private SelenideElement buttonCreateOrderInHeader;

    @FindBy(how = How.XPATH, using = "//*[text()='Статус заказа']")
    private SelenideElement buttonOrderStatus;

    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
    private SelenideElement inputSearchNumberOrderInHeader;

    @FindBy(how = How.XPATH, using = "//button[text()='Go!']")
    private SelenideElement buttonGoSearchNumberOrder;

    @FindBy(how = How.CLASS_NAME, using = "Home_Table__2kPxP")
    private SelenideElement blockAboutScooter;

    @FindBy(how = How.LINK_TEXT, using = " Модель Toxic PRO")
    private SelenideElement textNameScooter;

    @FindBy(how = How.LINK_TEXT, using = "Максимальная скорость")
    private SelenideElement textMaxSpeed;

    @FindBy(how = How.LINK_TEXT, using = "40 км/ч")
    private SelenideElement textMaxSpeedKmH;

    @FindBy(how = How.LINK_TEXT, using = "Проедет без поздарядки")
    private SelenideElement textTravelDistance;

    @FindBy(how = How.LINK_TEXT, using = "80 км")
    private SelenideElement textTravelDistanceKm;

    @FindBy(how = How.LINK_TEXT, using = "Выдерживает вес")
    private SelenideElement textWeight;

    @FindBy(how = How.LINK_TEXT, using = "120 кг")
    private SelenideElement textWeightMax;

    @FindBy(how = How.LINK_TEXT, using = "Как это работает")
    private SelenideElement textHowItWorks;

    @FindBy(how = How.CLASS_NAME, using = "Home_StatusCircle__3_aTp")
    private ElementsCollection numberStepsHowItWorks;

    @FindBy(how = How.LINK_TEXT, using = "Заказываете самокат")
    private SelenideElement headerTextStepsOne;

    @FindBy(how = How.LINK_TEXT, using = "Выбираете, когда и куда привезти")
    private SelenideElement textStepsOne;

    @FindBy(how = How.LINK_TEXT, using = "Курьер привозит самокат")
    private SelenideElement headerTextStepsTwo;

    @FindBy(how = How.LINK_TEXT, using = "А вы — оплачиваете аренду")
    private SelenideElement textStepsTwo;

    @FindBy(how = How.LINK_TEXT, using = "Катаетесь")
    private SelenideElement headerTextStepsThree;

    @FindBy(how = How.LINK_TEXT, using = "Сколько часов аренды осталось — видно на сайте")
    private SelenideElement textStepsThree;

    @FindBy(how = How.LINK_TEXT, using = "Курьер забирает самокат")
    private SelenideElement headerTextStepsFour;

    @FindBy(how = How.LINK_TEXT, using = "Когда аренда заканчивается")
    private SelenideElement textStepsFour;

    @FindBy(how = How.XPATH, using = "//div[@class='Home_FinishButton__1_cWm']" +
            "/child::button[text()='Заказать']")
    private SelenideElement buttonCreateOrderInRoadMap;

    @FindBy(how = How.XPATH, using = "//img[@src='/assets/ya.svg']")
    private SelenideElement buttonYandex;

    @FindBy(how = How.XPATH, using = "//img[@alt='Scooter']")
    private SelenideElement buttonScooter;

    @FindBy(how = How.XPATH, using = "//div[@tabindex='0']")
    private ElementsCollection buttonOpenAnswerToQuestions;

    @FindBy(how = How.XPATH, using = "//div[@data-accordion-component='AccordionItemPanel']")
    private ElementsCollection answerToQuestions;

    @FindBy(how = How.XPATH, using = "img[@src='/assets/blueprint.png']")
    private SelenideElement imgScooterBlueprint;

    @FindBy(how = How.XPATH, using = "img[@src='/assets/scooter.png']")
    private SelenideElement imgScooterBlack;

    @FindBy(how = How.XPATH, using = "Вопросы о важном")
    private SelenideElement textQuestionsAboutImportant;

    @FindBy(how = How.XPATH, using = "//img[@src='/assets/arrow-down.svg']")
    private SelenideElement buttonArrowDown;

    @FindBy(how = How.CLASS_NAME, using = "Home_FourPart__1uthg")
    private SelenideElement blockQuestionsAboutImportant;

    @FindBy(how = How.CLASS_NAME, using = "Home_FAQ__3uVm4")
    private SelenideElement blockFAQ;



    // Проверяет, что блок куки отображается
    public MainePage isCookieConsent() {
        cookieConsent.isDisplayed();
        return this;
    }

    // Проверяет, что текст куки отображается
    public MainePage isCookieText() {
        cookieText.isDisplayed();
        return this;
    }

    // Проверяет, что отображается заголовок главной страницы
    public MainePage isHeaderManeScooter() {
        headerManeScooter.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст под заголовком до скрола
    public MainePage isSubHeaderOne() {
        subHeaderOne.isDisplayed();
        return this;
    }

    // Проверяет, что отображается второй текст под заголовком
    // он отображается после скролла страницы
    public MainePage isSubHeaderTwo() {
        subHeaderTwo.isDisplayed();
        return this;
    }

    // Проверяет, что кнопка Заказать отображается
    public MainePage isButtonCreateOrderInHeader() {
        buttonCreateOrderInHeader.isDisplayed();
        return this;
    }

    // Проверяет, что отображается кнопка Статус заказа
    public MainePage isButtonOrderStatus() {
        buttonOrderStatus.isDisplayed();
        return this;
    }

    // Проверяет, что отображается поле для ввода номера заказа
    public MainePage isInputSearchNumberOrderInHeader() {
        inputSearchNumberOrderInHeader.isDisplayed();
        return this;
    }

    // Проверяет, что кнопка GO отображается
    public MainePage isButtonGoSearchNumberOrder() {
        buttonGoSearchNumberOrder.isDisplayed();
        return this;
    }

    // Проверяет, что блок о скутере отображается
    public MainePage isBlockAboutScooter() {
        blockAboutScooter.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Максимальная скорость
    public MainePage isTextMaxSpeed() {
        textMaxSpeed.isDisplayed();
        return this;
    }

    // Проверяет, что отображается Максимальная скорость
    public MainePage isTextMaxSpeedKmH() {
        textMaxSpeedKmH.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Максимальная дистанция
    public MainePage isTextTravelDistance() {
        textTravelDistance.isDisplayed();
        return this;
    }

    // Проверяет, что отображается Максимальная дистанция
    public MainePage isTextTravelDistanceKm() {
        textTravelDistanceKm.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Максимальная вес
    public MainePage isTextWeight() {
        textWeight.isDisplayed();
        return this;
    }

    // Проверяет, что отображается Максимальная вес
    public MainePage isTextWeightMax() {
        textWeightMax.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Как это работает
    public MainePage isTextHowItWorks() {
        textHowItWorks.isDisplayed();
        return this;
    }

    // Проверяет, что отображается верный номер шага
    // требует numberSteps. 1 - первый шаг, 2 - второй шаг и тд
    public MainePage isNumberStepsHowItWorks(int numberSteps) {
        numberStepsHowItWorks.get(numberSteps-1).isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Первого заголовка
    public MainePage isHeaderTextStepsOne() {
        headerTextStepsOne.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Первого шага
    public MainePage isTextStepsOne() {
        textStepsOne.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Второго заголовка
    public MainePage isHeaderTextStepsTwo() {
        headerTextStepsTwo.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Второго шага
    public MainePage isTextStepsTwo() {
        textStepsTwo.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Третьего заголовка
    public MainePage isHeaderTextStepsThree() {
        headerTextStepsThree.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Третьего шага
    public MainePage isTextStepsThree() {
        textStepsThree.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Четвертого заголовка
    public MainePage isHeaderTextStepsFour() {
        headerTextStepsFour.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Четвертого шага
    public MainePage isTextStepsFour() {
        textStepsFour.isDisplayed();
        return this;
    }

    // Проверяет, что отображается кнопка Заказать
    public MainePage isButtonCreateOrderInRoadMap() {
        buttonCreateOrderInRoadMap.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст заголовка Вопросы о важном
    public MainePage isTextQuestionsAboutImportant() {
        textQuestionsAboutImportant.isDisplayed();
        return this;
    }

    // Проверяет, что отображается блок Вопросы о важном
    public MainePage isBlockFourPart() {
        blockQuestionsAboutImportant.isDisplayed();
        return this;
    }

    // Проверяет, что отображается блок FAQ
    public MainePage isBlockFAQ() {
        blockFAQ.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст название модели
    public MainePage isTextNameScooter() {
        textNameScooter.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст хедера "Учебный тренажер"
    public MainePage isHeaderDisclaimerTrainingSimulator() {
        headerDisclaimerTrainingSimulator.isDisplayed();
        return this;
    }

    // Проверяет, что текст "Как это работает" не изменился
    public MainePage isImgScooterBlueprint() {
        imgScooterBlueprint.isDisplayed();
        return this;
    }

    // Проверяет, что отображается кнопка Scroll down
    public MainePage isButtonArrowDown() {
        buttonArrowDown.isDisplayed();
        return this;
    }

    // Проверяет, что отображается полное изображение скутера
    public MainePage isImgScooterBlack() {
        imgScooterBlack.scrollTo().isDisplayed();
        return this;
    }

    // Позволяет принять куки на сайте
    public MainePage clickButtonAcceptCookie() {
        buttonAcceptCookie.click();
        return this;
    }

    // Позволяет нажать на кнопку "Яндекс" и перейти на страницу Яндекс
    public MainePage clickButtonYandex() {
        buttonYandex.scrollTo().click();
        switchTo().window(1);
        return this;
    }

    // Позволяет нажать на кнопку "Самокат" и перейти главную страницу сервиса
    public MainePage clickButtonScooter() {
        buttonScooter.scrollTo().click();
        return this;
    }

    // Позволяет проверить ссылка соответствует ссылке главной страницы или нет
    public MainePage isUrlIsYandex() {
        String urlYandexActual = WebDriverRunner.url();
        try {
            assertEquals(URL_YANDEX, urlYandexActual, "Ссылка отличается");
        }
        finally {
            switchTo().window(1).close();
            switchTo().window(0);
        }
        return this;
    }

    // Позволяет проверить ссылка соответствует ссылке главной страницы или нет
    public MainePage urlIsManeScooter() {
        String urlManeScooterActual = WebDriverRunner.url();
        assertEquals(URL_MAINE_SCOOTER_PAGE, urlManeScooterActual, "Ссылка отличается");
        return this;
    }

    // Массив ответов на вопросы. При необходимости увеличить количество ответов,
    // просто допишите в answersToQuestion элемент массива
    public static String getAnswers(int numberQuestion) {
        String[] answersToQuestion = {

                /*Первый ответ*/
                "Сутки — 400 рублей. Оплата курьеру — наличными или картой.",

                /*Второй ответ*/
                "Пока что у нас так: один заказ — один самокат. " +
                        "Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.",

                /*Третий ответ*/
                "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. " +
                        "Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы " +
                        "привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.",

                /*Четвертый ответ*/
                "Только начиная с завтрашнего дня. Но скоро станем расторопнее.",

                /*Пятый ответ*/
                "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.",

                /*Шестой ответ*/
                "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься" +
                        " без передышек и во сне. Зарядка не понадобится.",

                /*Седьмой ответ*/
                "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.",

                /*Восьмой ответ*/
                "Да, обязательно. Всем самокатов! И Москве, и Московской области."
        };
        return answersToQuestion[numberQuestion];
    }

    /**
     * numberQuestion является переменной отвечающий за номер вопроса,
     * нумерация начинается с 0 до 7 включительно.
     * Т.е. 0 - это первый вопрос; 1 - второй вопрос; 2 - третий и тд!
     * При необходимости добавить новый вопрос-ответ, нужно просто
     * добавить новый элемент массива и увеличить его на 1 и тут поменять описание
     */
    public void openQuestionAndCheckingAnswer(int numberQuestion) {

        buttonOpenAnswerToQuestions.get(numberQuestion).scrollTo().click(); // Открывает нужный вопрос
        assertEquals(getAnswers(numberQuestion),
                answerToQuestions.get(numberQuestion).shouldBe(visible).getText(), "Текст отличается");
    }
}