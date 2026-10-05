import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LinkText {
    @Test
    public void testLinkText() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");
        driver.findElement(By.linkText("Form Authentication")).click();
       // driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.tagName("input")).sendKeys("tomsmith");
        //driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
    }
}
