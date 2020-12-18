import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosuggestive1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com");
        driver.findElement(By.id("fromCity")).click();
        WebElement make=driver.findElement(By.xpath("//input[@placeholder='From']"));
        make.sendKeys("jai");
        Thread.sleep(2000);
        make.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        make.sendKeys(Keys.ENTER);
        WebElement trip=driver.findElement(By.xpath("//input[@placeholder='To']"));
        trip.sendKeys("hyd");
        Thread.sleep(2000);
        trip.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(2000);
        trip.sendKeys(Keys.ENTER);


    }
}
