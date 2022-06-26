package ru.yandex.ui.components;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import ru.yandex.ui.data.Url;

import static com.codeborne.selenide.Selenide.switchTo;

public class HeadersComponents<T> {

    @FindBy(how = How.XPATH, using = "//img[@src='/assets/ya.svg']")
    private SelenideElement buttonYandex;

    @FindBy(how = How.XPATH, using = "//img[@alt='Scooter']")
    private SelenideElement buttonScooter;

    @FindBy(how = How.XPATH, using = "//*[text()='Статус заказа']")
    private SelenideElement buttonOrderStatus;

    @FindBy(how = How.XPATH, using = "//input[@class='Input_Input__1iN_Z Header_Input__xIoUq']")
    private SelenideElement inputSearchNumberOrderInHeader;

    @FindBy(how = How.XPATH, using = "//button[text()='Go!']")
    private SelenideElement buttonGoSearchNumberOrder;


    // Позволяет нажать на кнопку "Яндекс" и перейти на страницу Яндекс
    public T clickButtonYandex() {
        buttonYandex.scrollTo().click();
        switchTo().window(1);
        return (T) this;
    }

    // Позволяет нажать на кнопку "Самокат" и перейти главную страницу сервиса
    public T clickButtonScooter() {
        buttonScooter.scrollTo().click();
        return (T) this;
    }

    // Позволяет проверить ссылка соответствует ссылке главной страницы или нет
    public T isUrlIsYandex() {
        String urlYandexActual = WebDriverRunner.url();
        try {
            Assertions.assertEquals(Url.Yandex.getUrl(), urlYandexActual, "Ссылка отличается");
        } finally {
            switchTo().window(1).close();
            switchTo().window(0);
        }
        return (T) this;
    }

    // Позволяет проверить ссылка соответствует ссылке главной страницы или нет
    public T urlIsManeScooter() {
        String urlManeScooterActual = WebDriverRunner.url();
        Assertions.assertEquals(Url.MainPage.getUrl(), urlManeScooterActual, "Ссылка отличается");
        return (T) this;
    }

    // Метод нажимает на кнопку "Статус заказа", находящейся в футоре
    public T clickButtonOrderStatus() {
        buttonOrderStatus.click();
        return (T) this;
    }

    // Метод позволяет заполнить поле поиска заказа на главной странице
    public T setValueInputSearchNumberOrderInHeader(String valueForSearchOrder) {
        inputSearchNumberOrderInHeader.click();
        inputSearchNumberOrderInHeader.setValue(valueForSearchOrder);
        return (T) this;
    }

    // Метод кликает по кнопке поиска "GO!", тем самым производя поиск указанного номера заказа
    public T clickButtonGoSearchNumberOrder() {
        buttonGoSearchNumberOrder.click();
        return (T) this;
    }
}
