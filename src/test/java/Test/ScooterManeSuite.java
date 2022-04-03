package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ru.yandex.ScooterPageObject.ManePage;

import static com.codeborne.selenide.Selenide.*;

public class ScooterManeSuite {

    @BeforeTest
    public void settingsBrowser(){
        /** Снимите коммент со строчек ниже, для того что бы запустить тест в Firefox **/
//        System.setProperty("webdriver.geckodriver", "https://github.com/mozilla/geckodriver/releases");
//        System.setProperty("selenide.browser", "firefox");

        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);

        manePage.clickButtonAcceptCookie();
    }

    /** Проверка вопроса и ответа первого вопроса. */
    @Test
    public void answersToQuestionsOne() {
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);

        manePage.openQuestionAndCheckingAnswer(0);
    }

    /** Проверка вопроса и ответа второго вопроса. */
    @Test
    public void answersToQuestionsTwo() {
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);
        manePage.openQuestionAndCheckingAnswer(1);
    }

    /** Проверка вопроса и ответа третьего вопроса. */
    @Test
    public void answersToQuestionsThree() {
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);
        manePage.openQuestionAndCheckingAnswer(2);
    }

    /** Проверка вопроса и ответа четвертого вопроса. */
    @Test
    public void answersToQuestionsFour() {
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);
        manePage.openQuestionAndCheckingAnswer(3);
    }

    /** Проверка вопроса и ответа пятого вопроса. */
    @Test
    public void answersToQuestionsFive() {
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);
        manePage.openQuestionAndCheckingAnswer(4);
    }

    /** Проверка вопроса и ответа шестого вопроса. */
    @Test
    public void answersToQuestionsSix() {
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);
        manePage.openQuestionAndCheckingAnswer(5);
    }

    /** Проверка вопроса и ответа седьмого вопроса. */
    @Test
    public void answersToQuestionsSeven() {
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);
        manePage.openQuestionAndCheckingAnswer(6);
    }

    /** Проверка вопроса и ответа восьмого вопроса. */
    @Test
    public void answersToQuestionsEight() {
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);
        manePage.openQuestionAndCheckingAnswer(7);
    }

    /** Тест проверяет, что находясь на главной странице
     * и кликая на кнопку "Скутер", пользователь остается на главной **/
    @Test
    public void buttonScooterInManePage(){

        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru",
                        ManePage.class);

        manePage.clickButtonScooter()
                .isUrlIsManeScooter();
    }

    /** Тест проверяет, что находясь на главной странице и кликая на
     * кнопку "Яндекс", у пользователя открывается страница с Яндексом **/
    @Test
    public void buttonYandexInManePage(){
        ManePage manePage =
                open("https://qa-scooter.praktikum-services.ru/",
                        ManePage.class);

        manePage.clickButtonYandex();
        switchTo().window(1);
        manePage.isUrlIsYandex();
        switchTo().window(1).close();
        switchTo().window(0);
    }
}