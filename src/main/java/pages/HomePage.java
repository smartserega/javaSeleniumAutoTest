package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {

    public HomePage enterStationInDepartureField(String departureStation) {
        $("[name=\"schedule_station_from\"]").sendKeys(departureStation);
        return this;
    }

    public HomePage navigateToUrl() {
        open("https://www.tutu.ru/");
        return this;
    }

    public HomePage enterStationInDestinationField(String destinationStation) {
        $("[name=\"schedule_station_to\"]").sendKeys(destinationStation);
        return this;
    }

    public HomePage clickSearchButton() {
        $("[name=\"inner_wrapper\"]").click();
        return this;
    }

    public HomePage clickOnTrainTab(String text) {
        $(".tab_etrain").click();
        $(".tab_etrain").shouldHave(Condition.text(text));
        System.out.print($(".tab_etrain").getText());
        return this;
    }
}
