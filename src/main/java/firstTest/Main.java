package firstTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Main {
    private final String webDriverPath = "/Users/assafbalzamovich/Documents/chromedriver";
    private WebDriver driver;

    @Test
    public void wikipedia_title_appears() throws IOException {
        System.setProperty("webdriver.chrome.driver", webDriverPath);

        driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");

        WebElement icon = driver.findElement(By.className("central-textlogo-wrapper"));
        assertTrue(icon.isDisplayed());
    }
}
