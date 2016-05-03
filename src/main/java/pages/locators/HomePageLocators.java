package pages.locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;

public class HomePageLocators {

    public ElementsCollection Tasks = $$("div.col-md-6 a");
}
