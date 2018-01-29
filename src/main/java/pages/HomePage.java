package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class HomePage {

    int fluentWait = 10000;

    public HomePage navigateToUrl() {
        open("https://www.tutu.ru/");
        return this;
    }

    public HomePage clickOnTrainTab() {
        $(".tab_etrain").waitUntil(Condition.visible, fluentWait);
        $(".tab_etrain").click();
        return this;
    }

    public HomePage enterStationInDestinationField(String destinationStation) {
        $("[class*=\"m-etrain\"] .arrival.field_wrp .j-input_wrapper > input").waitUntil(Condition.visible, fluentWait);
        $("[class*=\"m-etrain\"] .arrival.field_wrp .j-input_wrapper > input").sendKeys(destinationStation);
        return this;
    }

    public HomePage enterStationInDepartureField(String departureStation) {
        $("[class*=\"m-etrain\"] .departure.field_wrp .j-input_wrapper > input").waitUntil(Condition.visible, fluentWait);
        $("[class*=\"m-etrain\"] .departure.field_wrp .j-input_wrapper > input").sendKeys(departureStation);
        sleep(5000);
        return this;
    }

    public HomePage clickSearchButton() {
        $("[name=\"inner_wrapper\"]").waitUntil(Condition.visible, 5000);
        $("[name=\"inner_wrapper\"]").click();
        return this;
    }

    public HomePage clickOnShceduleButton() {
        $(".b-train__form__main.j-main_search_form.m-etrain").waitUntil(Condition.visible, fluentWait);
        $(".b-train__form__main.j-main_search_form.m-etrain").click();
        return this;
    }
}
