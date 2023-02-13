package mobile.android;

import io.qameta.allure.Description;
import mobile.TestBase;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.AppiumBy.accessibilityId;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.id;

public class AndroidTest extends TestBase {
    @Test
    @Tag("android")
    @Description("Проверка поиска викпедии")
    void ebayTest() {
        $(accessibilityId("Search Wikipedia")).click();
        $(id("org.wikipedia.alpha:id/search_src_text")).sendKeys("Ebay");
        $(id("org.wikipedia.alpha:id/page_list_item_description"))
                        .shouldHave(text("American multinational internet corporation that manages eBay.com"));
    }
}
