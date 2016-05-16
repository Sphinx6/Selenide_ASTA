package pages.executors;

import pages.locators.Task4Locators;
import util.helpers.RandomStringGenerator;

import java.util.Random;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.sleep;
import static com.codeborne.selenide.Selenide.switchTo;

public class Task4Page {

    private String name;
    private String email;
    private String phone;


    public Task4Locators locators;

    public Task4Page(Task4Locators locators){
        this.locators = locators;
    }

    public void clickApply(){
        locators.applyButton.click();
    }

    public void generateRandomData(){
        RandomStringGenerator gen = new RandomStringGenerator();
        Random r = new Random();
        int number = r.nextInt(899) + 100;
        name = gen.getRandomString(15);
        email = gen.getRandomString(5) + '@' + gen.getRandomString(5) + ".com";
        phone = String.format("%d-%d-%d", number, number, number);
    }

    public void fillForm(){
        generateRandomData();
        switchTo().window(1);
        switchTo().frame(locators.frame.toWebElement());
        locators.name.setValue(name);
        locators.email.setValue(email);
        locators.phone.setValue(phone);
    }

    public void clickSendButton(){
        locators.sendButton.click();
    }

    public void assertMessage(){
        locators.message.shouldHave(text("Wiadomość została wysłana"));
        //switchTo().window(1).close();
    }

}
