package ru.yandex.ScooterPageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class OrderStatusPage extends BasePage<OrderStatusPage> {

    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Track_Input__1g7lq Input_Responsible__1jDKN']")
    private SelenideElement inputSearchNumberOrderInOrderStatusPage;

    @FindBy(how = How.XPATH, using = "//button[text()='Посмотреть']")
    private SelenideElement buttonWatchSearchNumberOrder;

    @FindBy(how = How.XPATH, using = "//img[@src='/assets/not-found.png']")
    private SelenideElement imgNotFound;


    // Метод позволяет заполнить поле поиска заказа на странице статуса заказа
    public OrderStatusPage setValueInputSearchNumberOrderInOrderStatusPage(String valueForSearchOrder) {

        inputSearchNumberOrderInOrderStatusPage.scrollTo().shouldHave
                (Condition.visible).setValue(valueForSearchOrder);
        return this;
    }

    // Метод позволяет на кнопку "Посмотреть", кнопка находиться непосредственно на странице поиска заказа
    public OrderStatusPage clickButtonWatchSearchNumberOrder() {
        buttonWatchSearchNumberOrder.click();
        return this;
    }

    // Метод проверяет, что по-указанному номеру заказа, заказа нет
    public OrderStatusPage isDisplayedImgNotFound() {
        imgNotFound.shouldHave(Condition.visible, Duration.ofMillis(1500));
        return this;
    }
}