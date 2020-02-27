import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AddRemoveElements {
    @Test
    public void addRemoveElements() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/add_remove_elements/");
        By addElement = By.xpath("//button[text()='Add Element']");
        driver.findElement(addElement).click();
        driver.findElement(addElement).click();
        driver.findElement(By.className("added-manually")).click();
        int deleteButtons = driver.findElements(By.className("added-manually")).size();
        assertEquals(deleteButtons, 1, "One button is remaining");
        driver.quit();
    }
}
