import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Inputs {
    @Test
    public void inputs() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.xpath("//div[@class='example']//input")).sendKeys(Keys.ARROW_UP);
        String resultUp = driver.findElement(By.xpath("//div[@class='example']//input")).getAttribute("value");
        assertEquals(resultUp, "1", "Не работает");
        driver.findElement(By.xpath("//div[@class='example']//input")).sendKeys(Keys.ARROW_DOWN);
        String resultDown = driver.findElement(By.xpath("//div[@class='example']//input")).getAttribute("value");
        assertEquals(resultDown, "0", "Не работает");
        driver.quit();
    }
}
