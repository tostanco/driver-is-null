package com.tostanco.stepDefs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.tostanco.pages.GooglePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
// allure serve target\surefire-reports

public class GoogleTest {

    private WebDriver driver;
    private GooglePage googlePage;


    @BeforeAll
    static void setupAll() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        // driver = WebDriverManager.chromedriver().create();
        googlePage = PageFactory.initElements(driver, GooglePage.class);
        googlePage.openLandingPage();
        // googlePage.testBrowser();
    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

    @Test 
    @Given("Page is loaded")
    // @Epic("Testing first page")
    // @Feature("Deny")
    // @Story("Deny Form")
    // @Description("Sprawdzenie ładowania strony")
    // // @TmsLink("JIRA-125") //przykładowy link z Test Casem do Jiry
    // @Step("Ładowanie")
    public void googleBasicTest() {
        googlePage.testBrowser();
        System.out.println("Page is loaded!!!");
    }

    @When("I click button")
    public void I_click_button() {
        
        System.out.println("Button clicked!!!!!");
    }

    @Then("notification will disappear")
    public void notification_will_disappear() {
        // logger.atInfo();
        System.out.println("Whole page is visible");
    }    
}
