package ru.yandex.data;

import static ru.yandex.utils.Properties.loadProperty;

public enum Url {

    Yandex(loadProperty("Yandex")),
    MainPage(loadProperty("MainPage")),
    OrderPage(loadProperty("OrderPage")),
    StatusPage(loadProperty("StatusPage"));

    private String url;

    Url(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
