import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class CheckBoxes {
    @Test
    public void checkBoxes() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        List<WebElement> check = driver.findElements(By.tagName("input"));
        assertEquals(check.get(0).isSelected(), false, "Первый элемент checked");
        check.get(0).click();
        assertEquals(check.get(0).isSelected(), true, "Первый элемент unchecked");
        assertEquals(check.get(1).isSelected(), true, "Второй элемент unchecked");
        check.get(1).click();
        assertEquals(check.get(1).isSelected(), false, "Второй элемент checked");
        driver.quit();
    }
}
