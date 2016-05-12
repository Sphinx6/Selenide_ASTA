package pages.locators;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class Task3Locators {

    public SelenideElement menu = $("a.dropdown-toggle");
    public SelenideElement formMenu = $("#menu1 > li > a", 0);
    public SelenideElement startEdit = $("#start-edit");
    public SelenideElement nameInput = $("#in-name");
    public SelenideElement surnameInput = $("#in-surname");
    public SelenideElement notesInput = $("#in-notes");
    public SelenideElement phoneInput = $("#in-phone");
    public SelenideElement saveButton = $("#save-btn");
    public SelenideElement uploadButton = $("#in-file");
    public SelenideElement notifiaction = $("div.notifyjs-bootstrap-base > span");
}
