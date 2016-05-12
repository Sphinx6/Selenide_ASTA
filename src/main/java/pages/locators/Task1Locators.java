package pages.locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;

public class Task1Locators {

    public ElementsCollection items = $$("div.caption");
    public ElementsCollection itemsInCart = $$("div.row.row-in-basket");
    public SelenideElement quantitySummary = $("span.summary-quantity");
    public SelenideElement priceSummary = $("span.summary-price");
}
