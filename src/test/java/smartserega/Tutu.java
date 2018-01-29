package smartserega;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;


public class Tutu extends BaseTest {

    @Test
    public void tutuTest() throws InterruptedException {
        new HomePage()
                .navigateToUrl()
                .clickOnTrainTab()
                .enterStationInDepartureField("Петровско-Разумовская")
                .enterStationInDestinationField("Тверь")
                .clickSearchButton()
                .clickOnShceduleButton();
    }

}
