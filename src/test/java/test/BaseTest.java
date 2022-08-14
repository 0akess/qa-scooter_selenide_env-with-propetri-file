package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;

abstract public class BaseTest {

    public static void setUp() {
//
//        Configuration.remote = "http://localhost:4445/wd/hub";
//        Configuration.browser = "chrome";
//        Configuration.browserCapabilities
//        Configuration.browserSize = "1280x1024";
//        DesiredCapabilities capabilities = new DesiredCapabilities();
////        capabilities.setCapability("enableVNC", true);
//        Configuration.browserCapabilities = capabilities;
    }

//    @BeforeAll
    public void init() {
//        Configuration.remote = "http://localhost:4445/wd/hub";
        Configuration.browser = Browser.FIREFOX.browserName();
//        Configuration.browserVersion = "88.0";
//        Configuration.browserSize = "1280x1024";
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("enableVNC", true);
//        Configuration.browserCapabilities = capabilities;
    }
}
