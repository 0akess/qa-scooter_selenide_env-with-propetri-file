package Test;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.yandex.ScooterPageObject.MainePage;

import static com.codeborne.selenide.Selenide.open;

public class ScooterMaineSuite {

    // Проверка вопроса и ответа на вопроса
    @ParameterizedTest
    @ValueSource(ints = { 0, 1, 2, 3, 4, 5, 6, 7 })
    public void answersToQuestionsTwo(Integer argument) {

        MainePage mainePage =
                open("https://qa-scooter.praktikum-services.ru",
                        MainePage.class);

        mainePage
                .openQuestionAndCheckingAnswer(argument);
    }

    // Тест проверяет, что находясь на главной странице
    // и кликая на кнопку "Скутер", пользователь остается на главной
    @Test
    public void buttonScooterInManePage(){

        MainePage mainePage =
                open("https://qa-scooter.praktikum-services.ru",
                        MainePage.class);

        mainePage.clickButtonScooter()
                .urlIsManeScooter();
    }

    // Тест проверяет, что находясь на главной странице и кликая на
    // кнопку "Яндекс", у пользователя открывается страница с Яндексом
    @Test
    public void buttonYandexInManePage(){

        MainePage mainePage =
                open("https://qa-scooter.praktikum-services.ru",
                        MainePage.class);

        mainePage.clickButtonYandex()
                .isUrlIsYandex();
    }
}