package com.tostanco.pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage {

    private final WebDriver driver;

// private static By odrzucButton = By.xpath("//*[text()='Odrzuć wszystko']");
    @FindBy(xpath = "//*[text()='Odrzuć wszystko']")
    private WebElement odrzucBtn;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
    }   

    public void openLandingPage(){
        driver.get("https://google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    public void testBrowser() {
        Actions at = new Actions(driver);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // driver.findElement(odrzucButton).click();
        odrzucBtn.click();
        
    }
}
