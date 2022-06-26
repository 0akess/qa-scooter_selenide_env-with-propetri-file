package ru.yandex.ScooterPageObject;

import com.codeborne.selenide.Selenide;
import ru.yandex.components.HeadersComponents;
import ru.yandex.data.Url;

public abstract class BasePage<T> extends HeadersComponents<T> {

    public T open(Url url) {
        Selenide.open(url.getUrl());
        return (T) this;
    }
}
