import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DropDown {
    @Test
    public void dropDown() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select options = new Select(driver.findElement(By.tagName("select")));
        options.selectByIndex(1);
        String value = options.getFirstSelectedOption().getAttribute("innerText");
        assertEquals(value, "Option 1", "Неверная опция");
        options.selectByIndex(2);
        value = options.getFirstSelectedOption().getAttribute("innerText");
        assertEquals(value, "Option 2", "Неверная опция");
        driver.quit();
    }
}
