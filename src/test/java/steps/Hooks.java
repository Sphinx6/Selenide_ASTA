package steps;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.cs.A;
import util.configurations.TestConfiguration;

import java.util.Set;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.clearBrowserCache;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class Hooks {

    private String baseWindowHdl;

    @Before
    public void beforeAll() {
        new TestConfiguration();
        open("/");
    }

    @After
    public void afterScenario() {
        clearBrowserCache();
    }

    @Before("@NewWindow")
    public void beforeScenario(){
        baseWindowHdl = getWebDriver().getWindowHandle();
    }

    @After("@NewWindow")
    public void afterSecnario(){
        getWebDriver().close();
        getWebDriver().switchTo().window(baseWindowHdl);
    }
}
