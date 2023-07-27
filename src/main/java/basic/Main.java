package basic;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Main {
    private final String webDriverPath = "/Users/assafbalzamovich/Documents/chromedriver";
    private WebDriver driver;

    @Test
    public void NavigationExample() throws IOException {
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        driver = new ChromeDriver();
        driver.get("https://ynet.co.il");
    }
}
