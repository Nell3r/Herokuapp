import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Notfication {
    @Test
    public void notification() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/notification_message_rendered");
        driver.findElement(By.xpath("//a[contains(text(),'Click here')]")).click();
        String message = driver.findElement(By.xpath("//div[@id='flash']")).getText();
        assertEquals(message, "Action successful", "Тест не прошел");
        driver.quit();
    }
}
