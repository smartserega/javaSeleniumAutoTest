package smartserega;

import base.BaseTest;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import pages.HomePage;


public class Tutu extends BaseTest {

    @Test
    public void tutuTest() throws InterruptedException {
        new HomePage()
                .navigateToUrl()
                .clickOnTrainTab("Электрички");
        Selenide.sleep(5000);

        new HomePage()
                .enterStationInDepartureField("Петровско-Разумовская");
        Selenide.sleep(5000);

        new HomePage()
                .enterStationInDestinationField("Тверь")
                .clickSearchButton();
        Selenide.sleep(5000);

        new HomePage()
                .clickonSceduleButton("Показать расписание");
        Selenide.sleep(5000);

    }

}
