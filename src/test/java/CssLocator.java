import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssLocator {
    @Test
    public void cssLocatorTest(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/?utm_source=chatgpt.com");
        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.cssSelector("input#username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("input#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector("button.radius")).click();
    }
}
