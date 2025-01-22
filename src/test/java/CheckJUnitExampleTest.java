import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

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
        $("#wiki-tab").click();


    }
}
