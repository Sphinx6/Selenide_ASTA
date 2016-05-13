package pages.locators;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class Task4Locators {

    public SelenideElement apply = $("button");
    public SelenideElement name = $("input[name='name']");
    public SelenideElement email = $("input[name='email']");
    public SelenideElement phone = $("input[name='phone']");
}
