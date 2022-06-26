package Test;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;

abstract public class BaseTest {

    public static void setUp() {

        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";

        Configuration.driverManagerEnabled = true;
//        Configuration.browserSize = "1920x1080";
        Configuration.headless = false;
    }

    @BeforeAll
    public static void init() {
        setUp();
    }
}
