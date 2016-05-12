package pages.executors;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;
import pages.locators.Task3Locators;
import util.helpers.RandomStringGenerator;

import java.io.File;
import java.util.Random;

import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Task3Page {

    private String name;
    private String surname;
    private String note;
    private String phone;
    private String filePath = "src/main/resources/qa1.png";

    public Task3Locators locators;

    public Task3Page(Task3Locators locators){
        this.locators = locators;
    }

    public void generateRandomValues(){
        RandomStringGenerator gen = new RandomStringGenerator();
        Random r = new Random();
        this.name = gen.getRandomString(6);
        this.surname = gen.getRandomString(10);
        this.note = gen.getRandomSentences(2);
        this.phone = Integer.toString(r.nextInt(9000000)+1000000);
    }

    public void startEdit(){
        locators.menu.hover();
        locators.formMenu.shouldBe(visible);
        locators.formMenu.hover();
        locators.startEdit.shouldBe(visible);
        locators.startEdit.click();
        Actions a = new Actions(getWebDriver());
        a.moveByOffset(50,50).build().perform();
    }

    public void enterName(String name){
        locators.nameInput.shouldBe(enabled);
        locators.nameInput.setValue(name);
    }

    public void enterSurname(String surname){
        locators.surnameInput.shouldBe(enabled);
        locators.surnameInput.setValue(surname);
    }

    public void enterNote(String note){
        locators.notesInput.shouldBe(enabled);
        locators.notesInput.setValue(note);
    }

    public void enterPhone(String phone){
        locators.phoneInput.shouldBe(enabled);
        locators.phoneInput.setValue(phone);
    }

    public void clickSave(){
        locators.saveButton.click();
    }

    public String getName(){
        return locators.nameInput.getText();
    }

    public String getSurname(){
        return locators.surnameInput.getText();
    }

    public String getNote(){
        return locators.notesInput.getText();
    }

    public String getPhone(){
        return locators.phoneInput.getText();
    }

    public void uploadFile(){
        File f = new File(this.filePath);
        locators.uploadButton.uploadFile(f);
    }

    public void assertNotification(){
        locators.notifiaction.shouldHave(text("Twoje dane zostały poprawnie zapisane"));
    }

    public void fillForm(){
        generateRandomValues();
        enterName(name);
        enterSurname(surname);
        enterNote(note);
        enterPhone(phone);
    }

    public void assertFormData(){
        assert name.equals(getName()) : String.format("Incorrect name: %s|%s", name, getName());
        assert surname.equals(getSurname()) : String.format("Incorrect surname: %s|%s", surname, getSurname());
        assert note.equals(getNote()) : String.format("Incorrect note: %s|%s", note, getNote());
        assert phone.equals((getPhone())) : String.format("Incorrect phone: %s|%s", phone, getPhone());
    }
}
