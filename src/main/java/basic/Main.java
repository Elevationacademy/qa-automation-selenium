package basic;

import io.cucumber.java.BeforeAll;
import org.json.JSONObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Main {
    private static final String webDriverPath = "/Users/assafbalzamovich/Documents/chromedriver";
    private WebDriver driver;


    @BeforeAll
    public static void beforeAll(){
        System.setProperty("webdriver.chrome.driver", webDriverPath);
    }

    @BeforeEach
    public void before(){
        driver = new ChromeDriver();
        driver.get("https://zap.co.il");
    }
    @AfterEach
    public void after(){
        driver.close();
    }
    @Test
    public void NavigationExample() throws IOException {
        WebElement search = driver.findElement(By.id("acSearch-input"));
        search.sendKeys("playstation 5");
        WebElement submitSearch = driver.findElement(By.id("acSubmitSearch"));
        submitSearch.click();
        WebElement firstResult = driver.findElement(By.xpath("//div[@id='divSearchResults']//div[@data-index='1']//a[@class='ModelTitle']"));
        assertEquals("Sony PlayStation 5 825GB Blu-ray Edition",firstResult.getText());
    }



}
