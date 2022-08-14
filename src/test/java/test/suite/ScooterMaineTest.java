package test.suite;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.openqa.selenium.remote.Browser;
import ru.yandex.ui.data.Url;
import ru.yandex.ui.po.pages.MainePage;
import ru.yandex.ui.data.AnswersManePage;
import test.BaseTest;

import static com.codeborne.selenide.Selenide.page;

public class ScooterMaineTest extends BaseTest {

    private static final MainePage mainePage = page(MainePage.class);

    @BeforeAll
    public static void startTest() {
        Configuration.browser = Browser.FIREFOX.browserName();
        mainePage
                .open(Url.MainPage)
                .clickButtonAcceptCookie();
    }

    // Проверка ответов на вопросы
    @ParameterizedTest
    @EnumSource(AnswersManePage.class)
    public void answersToQuestionsTwo(AnswersManePage answersManePage) {

        mainePage
                .open(Url.MainPage)
                .openQuestionAndCheckingAnswer(answersManePage);
    }

    // Тест проверяет, что находясь на главной странице
    // и кликая на кнопку "Скутер", пользователь остается на главной
    @Test
    public void buttonScooterInManePage() {

        mainePage
                .open(Url.MainPage)
                .clickButtonScooter()
                .urlIsManeScooter();
    }

    // Тест проверяет, что находясь на главной странице и кликая на
    // кнопку "Яндекс", у пользователя открывается страница с Яндексом
    @Test
    public void buttonYandexInManePage() {

        mainePage
                .open(Url.MainPage)
                .clickButtonYandex()
                .isUrlIsYandex();
    }
}