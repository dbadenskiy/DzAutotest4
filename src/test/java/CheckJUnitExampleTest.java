import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CheckJUnitExampleTest {

    @BeforeAll
    static void beforeALL() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1474x822";
        Configuration.timeout = 5000;
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void checkJUniteCodeExampleTest() {
        open("https://github.com/");
        $(".search-input").click();
        $("#query-builder-test").setValue("selenide").pressEnter();
        $("a[href='/selenide/selenide']").click();
        $("a[href='/selenide/selenide']").shouldHave(text("selenide"));
        $("#wiki-tab").click();
        $("#wiki-pages-filter").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-pages-box").shouldHave(text("SoftAssertions"));
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#wiki-content").shouldHave(text("3. Using JUnit5 extend test class:"));

    }
}
