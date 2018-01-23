package pages;

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

}
