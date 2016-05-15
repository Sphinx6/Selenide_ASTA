package pages.locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Task5Locators {

    public SelenideElement uploadButton = $("input");
    public ElementsCollection rows = $$("tbody > tr");
}
