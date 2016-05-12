package pages.locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Task2Locators {

    public SelenideElement groupBar = $("span.select2-selection");
    public SelenideElement groupInput = $("input");
    public SelenideElement firstResult = $("ul.select2-results__options > li");
    public ElementsCollection itemsGroups = $$("div.caption>p > strong");
}
