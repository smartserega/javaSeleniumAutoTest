package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class HomePage {


    public HomePage navigateToUrl() {
        open("https://www.tutu.ru/");
        return this;
    }

    public HomePage clickOnTrainTab(String text) {
        $(".tab_etrain").click();
        return this;
    }

    public HomePage enterStationInDestinationField(String destinationStation) {
        $(".input_field.j-station_input.j-station_input_from[placeholder='Откуда']").sendKeys(destinationStation);
        return this;
    }

    public HomePage enterStationInDepartureField(String departureStation) {
        $(".input_field.j-station_input.j-station_input_to[placeholder='Куда']").sendKeys(departureStation);
        return this;
    }

    public HomePage clickSearchButton() {
        $("[name=\"inner_wrapper\"]").click();
        return this;
    }

    public void clickonSceduleButton(String text) {
        $(".b-train__form__main.j-main_search_form.m-etrain").click();
        return this;
    }
}
