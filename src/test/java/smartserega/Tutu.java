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
/*                .enterStationInDepartureField("Петровско-Разумовская")
                .enterStationInDestinationField("Тверь")
                .clickSearchButton();*/
    }

}
