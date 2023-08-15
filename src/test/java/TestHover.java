import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class TestHover {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void shouldHaveTextBLTB() {

        open("https://github.com");

        $(".header-menu-wrapper").$(byText("Solutions")).hover();

        $(".header-menu-wrapper").$(withTagAndText("a", "Enterprise")).click();

        $(".application-main h1").shouldHave(text("Build like the best"));

    }
}
