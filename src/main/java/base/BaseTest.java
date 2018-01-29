package base;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static com.codeborne.selenide.Selenide.close;

public class BaseTest {

    @BeforeTest
    public static void setup() {
        Configuration.browser = "Chrome";
        ChromeDriverManager.getInstance().setup();
    }

    @AfterTest
    public static void tearDown() {
        close();
    }

}
