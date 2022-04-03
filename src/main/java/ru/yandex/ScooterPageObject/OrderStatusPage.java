package ru.yandex.ScooterPageObject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.time.Duration;

public class OrderStatusPage {

    @FindBy(how = How.XPATH, using = "//*[text()='Статус заказа']")
    private SelenideElement buttonOrderStatus;

    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
    private SelenideElement inputSearchNumberOrderInHeader;

    @FindBy(how = How.XPATH, using = "//button[text()='Go!']")
    private SelenideElement buttonGoSearchNumberOrder;

    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Track_Input__1g7lq Input_Responsible__1jDKN']")
    private SelenideElement inputSearchNumberOrderInOrderStatusPage;

    @FindBy(how = How.XPATH, using = "//button[text()='Посмотреть']")
    private SelenideElement buttonWatchSearchNumberOrder;

    @FindBy(how = How.XPATH, using = "//img[@src='/assets/not-found.png']")
    private SelenideElement imgNotFound;


    /** Метод нажимает на кнопку "Статус заказа", находящейся в футоре **/
    public OrderStatusPage clickButtonOrderStatus(){
        buttonOrderStatus.click();
        return this;
    }

    /** Метод позволяет заполнить поле поиска заказа на главной странице **/
    public OrderStatusPage setValueInputSearchNumberOrderInHeader(String valueForSearchOrder){
        inputSearchNumberOrderInHeader.click();
        inputSearchNumberOrderInHeader.setValue(valueForSearchOrder);
        return this;
    }

    /** Метод кликает по кнопке поиска "GO!", тем самым производя поиск указанного номера заказа **/
    public OrderStatusPage clickButtonGoSearchNumberOrder(){
        buttonGoSearchNumberOrder.click();
        return this;
    }

    /** Метод позволяет заполнить поле поиска заказа на странице статуса заказа **/
    public OrderStatusPage setValueInputSearchNumberOrderInOrderStatusPage(String valueForSearchOrder){

        inputSearchNumberOrderInOrderStatusPage.scrollTo().shouldHave
                (Condition.visible).setValue(valueForSearchOrder);
        return this;
    }

    /** Метод позволяет на кнопку "Посмотреть", кнопка находиться непосредственно на странице поиска заказа **/
    public OrderStatusPage clickButtonWatchSearchNumberOrder(){
        buttonWatchSearchNumberOrder.click();
        return this;
    }

    /** Метод проверяет, что по-указанному номеру заказа, заказа нет **/
    public OrderStatusPage isDisplayedImgNotFound(){
        imgNotFound.shouldHave(Condition.visible, Duration.ofMillis(1500));
        return this;
    }
}