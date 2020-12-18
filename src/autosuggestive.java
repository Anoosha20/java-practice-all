import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive {
    public static <webelement> void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yatra.com");
        WebElement source=driver.findElement(By.id("BE_flight_origin_city"));
        source.clear();
        source.sendKeys("Ban");
        Thread.sleep(2000);
        source.sendKeys(Keys.ARROW_DOWN);
        source.sendKeys(Keys.ENTER);
        WebElement destination=driver.findElement(By.id("BE_flight_arrival_city"));
        destination.clear();
        destination.sendKeys("hyd");
        Thread.sleep(2000);
        destination.sendKeys(Keys.ENTER);



    }
}
