import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SelenidePageTests {

    @Test
    void findJUnitCode() {
        open("https://github.com/selenide/selenide");
        $(".Box-body").shouldHave(text("Selenide = UI Testing Framework powered by Selenium WebDriver"));

        $(".UnderlineNav-body").$(byText("Wiki")).click();

        $("#wiki-body").shouldHave(text("Welcome to the selenide wiki!"));
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"))
                                       .$(byText("SoftAssertions")).click();

        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));
    }
}
