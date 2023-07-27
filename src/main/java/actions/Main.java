package actions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    private final String webDriverPath = "/Users/assafbalzamovich/Documents/chromedriver";
    private WebDriver driver;

    @Test
    public void NavigationExample() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver", webDriverPath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://material.angular.io/cdk/drag-drop/examples");
        Actions actions = new Actions(driver);

        WebElement drag = driver.findElement(By.xpath("//div[text()='Fall asleep']"));
        WebElement dragTo = driver.findElement(By.xpath("//div[text()='Take a shower']"));

//        actions.dragAndDrop(drag, dragTo).build().perform();
        actions.clickAndHold(drag).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(dragTo).release().build().perform();
    }
}
