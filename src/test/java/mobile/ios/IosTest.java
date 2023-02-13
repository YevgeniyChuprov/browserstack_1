package mobile.ios;

import mobile.TestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;
import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.id;

public class IosTest extends TestBase {

    @Test
    @Tag("ios")
    void searchTestIos() {
        $(id("Text Button")).click();
        assertEquals("Waiting for text input.", $(id("Text Output")).getText());
        $(id("Text Input")).click();
        $(id("Text Input")).sendKeys("hello@browserstack.com");
        $(id("Text Input")).pressEnter();
        assertEquals("hello@browserstack.com", $(id("Text Output")).getText());
    }
}