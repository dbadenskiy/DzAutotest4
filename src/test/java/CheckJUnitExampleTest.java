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
    }

    @Test
    void checkJUniteCodeExampleTest() {
        open("https://github.com/");
    }
}
