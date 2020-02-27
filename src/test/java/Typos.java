import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Typos {
    @Test
    public void typos() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/typos");
        String text = driver.findElement(By.xpath("//p[contains(text(),\"Sometimes you'll see a typo, other times you won,t\")]")).getText();
        assertEquals(text, "Sometimes you'll see a typo, other times you won,t", "Текст не соответствует");
        driver.quit();
    }
}
