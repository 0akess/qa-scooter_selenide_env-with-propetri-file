package ru.yandex.ScooterPageObject;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ru.yandex.data.AnswersManePage;

import static com.codeborne.selenide.Condition.visible;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainePage extends BasePage<MainePage> {

    @FindBy(how = How.XPATH, using = "//button[text()='да все привыкли']")
    private SelenideElement buttonAcceptCookie;

    @FindBy(how = How.XPATH, using = "//div[@tabindex='0']")
    private ElementsCollection buttonOpenAnswerToQuestions;

    @FindBy(how = How.XPATH, using = "//div[@data-accordion-component='AccordionItemPanel']")
    private ElementsCollection answerToQuestions;


    // Позволяет принять куки на сайте
    public MainePage clickButtonAcceptCookie() {
        buttonAcceptCookie.click();
        return this;
    }

    // Проверяет открытие ответа на вопрос
    public void openQuestionAndCheckingAnswer(AnswersManePage answersManePage) {

        buttonOpenAnswerToQuestions.get(
                answersManePage.getNumberQuestions()).scrollTo().click(); // Открывает нужный вопрос
        assertEquals(answersManePage.getAnswer(),
                answerToQuestions.get(answersManePage.getNumberQuestions()).shouldBe(visible).getText(),
                "Текст отличается");
    }
}