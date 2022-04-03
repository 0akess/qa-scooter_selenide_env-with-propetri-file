package ru.yandex.ScooterPageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.visible;

public class ManePage {

    public static final String urlYandex = "https://yandex.ru/";
    public static final String urlManeScooter = "https://qa-scooter.praktikum-services.ru/";


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
    public ManePage isCookieConsent() {
        cookieConsent.isDisplayed();
        return this;
    }

    // Проверяет, что текст куки отображается
    public ManePage isCookieText() {
        cookieText.isDisplayed();
        return this;
    }

    // Проверяет, что отображается заголовок главной страницы
    public ManePage isHeaderManeScooter() {
        headerManeScooter.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст под заголовком до скрола
    public ManePage isSubHeaderOne() {
        subHeaderOne.isDisplayed();
        return this;
    }

    // Проверяет, что отображается второй текст под заголовком
    // он отображается после скролла страницы
    public ManePage isSubHeaderTwo() {
        subHeaderTwo.isDisplayed();
        return this;
    }

    // Проверяет, что кнопка Заказать отображается
    public ManePage isButtonCreateOrderInHeader() {
        buttonCreateOrderInHeader.isDisplayed();
        return this;
    }

    // Проверяет, что отображается кнопка Статус заказа
    public ManePage isButtonOrderStatus() {
        buttonOrderStatus.isDisplayed();
        return this;
    }

    // Проверяет, что отображается поле для ввода номера заказа
    public ManePage isInputSearchNumberOrderInHeader() {
        inputSearchNumberOrderInHeader.isDisplayed();
        return this;
    }

    // Проверяет, что кнопка GO отображается
    public ManePage isButtonGoSearchNumberOrder() {
        buttonGoSearchNumberOrder.isDisplayed();
        return this;
    }

    // Проверяет, что блок о скутере отображается
    public ManePage isBlockAboutScooter() {
        blockAboutScooter.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Максимальная скорость
    public ManePage isTextMaxSpeed() {
        textMaxSpeed.isDisplayed();
        return this;
    }

    // Проверяет, что отображается Максимальная скорость
    public ManePage isTextMaxSpeedKmH() {
        textMaxSpeedKmH.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Максимальная дистанция
    public ManePage isTextTravelDistance() {
        textTravelDistance.isDisplayed();
        return this;
    }

    // Проверяет, что отображается Максимальная дистанция
    public ManePage isTextTravelDistanceKm() {
        textTravelDistanceKm.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Максимальная вес
    public ManePage isTextWeight() {
        textWeight.isDisplayed();
        return this;
    }

    // Проверяет, что отображается Максимальная вес
    public ManePage isTextWeightMax() {
        textWeightMax.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Как это работает
    public ManePage isTextHowItWorks() {
        textHowItWorks.isDisplayed();
        return this;
    }

    // Проверяет, что отображается верный номер шага
    // требует numberSteps. 1 - первый шаг, 2 - второй шаг и тд
    public ManePage isNumberStepsHowItWorks(int numberSteps) {
        numberStepsHowItWorks.get(numberSteps-1).isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Первого заголовка
    public ManePage isHeaderTextStepsOne() {
        headerTextStepsOne.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Первого шага
    public ManePage isTextStepsOne() {
        textStepsOne.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Второго заголовка
    public ManePage isHeaderTextStepsTwo() {
        headerTextStepsTwo.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Второго шага
    public ManePage isTextStepsTwo() {
        textStepsTwo.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Третьего заголовка
    public ManePage isHeaderTextStepsThree() {
        headerTextStepsThree.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Третьего шага
    public ManePage isTextStepsThree() {
        textStepsThree.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Четвертого заголовка
    public ManePage isHeaderTextStepsFour() {
        headerTextStepsFour.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст Четвертого шага
    public ManePage isTextStepsFour() {
        textStepsFour.isDisplayed();
        return this;
    }

    // Проверяет, что отображается кнопка Заказать
    public ManePage isButtonCreateOrderInRoadMap() {
        buttonCreateOrderInRoadMap.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст заголовка Вопросы о важном
    public ManePage isTextQuestionsAboutImportant() {
        textQuestionsAboutImportant.isDisplayed();
        return this;
    }

    // Проверяет, что отображается блок Вопросы о важном
    public ManePage isBlockFourPart() {
        blockQuestionsAboutImportant.isDisplayed();
        return this;
    }

    // Проверяет, что отображается блок FAQ
    public ManePage isBlockFAQ() {
        blockFAQ.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст название модели
    public ManePage isTextNameScooter() {
        textNameScooter.isDisplayed();
        return this;
    }

    // Проверяет, что отображается текст хедера "Учебный тренажер"
    public ManePage isHeaderDisclaimerTrainingSimulator() {
        headerDisclaimerTrainingSimulator.isDisplayed();
        return this;
    }

    // Проверяет, что текст "Как это работает" не изменился
    public ManePage isImgScooterBlueprint() {
        imgScooterBlueprint.isDisplayed();
        return this;
    }

    // Проверяет, что отображается кнопка Scroll down
    public ManePage isButtonArrowDown() {
        buttonArrowDown.isDisplayed();
        return this;
    }

    // Проверяет, что отображается полное изображение скутера
    public ManePage isImgScooterBlack() {
        imgScooterBlack.scrollTo().isDisplayed();
        return this;
    }

    /**
     * Позволяет принять куки на сайте
     **/
    public ManePage clickButtonAcceptCookie() {
        buttonAcceptCookie.click();
        return this;
    }

    /**
     * Позволяет нажать на кнопку "Яндекс" и перейти на страницу Яндекс
     */
    public ManePage clickButtonYandex() {
        buttonYandex.scrollTo().click();
        return this;
    }

    /**
     * Позволяет нажать на кнопку "Самокат" и перейти главную страницу сервиса
     */
    public ManePage clickButtonScooter() {
        buttonScooter.scrollTo().click();
        return this;
    }

    /**
     * Позволяет проверить ссылка соответствует ссылке главной страницы или нет
     */
    public ManePage isUrlIsYandex() {
        String urlYandexActual = WebDriverRunner.url();
        Assert.assertEquals(urlYandexActual, urlYandex, "Ссылка отличается");
        return this;
    }

    /**
     * Позволяет проверить ссылка соответствует ссылке главной страницы или нет
     */
    public ManePage isUrlIsManeScooter() {
        String urlManeScooterActual = WebDriverRunner.url();
        Assert.assertEquals(urlManeScooterActual, urlManeScooter, "Ссылка отличается");
        return this;
    }

    /**
     * Массив ответов на вопросы. При необходимости увеличить количество ответов,
     * просто допишите в answersToQuestion элемент массива
     */
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
        Assert.assertEquals(answerToQuestions.get(numberQuestion).shouldBe(visible).getText(),
                getAnswers(numberQuestion), "Текст отличается");
    }
}