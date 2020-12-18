import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JetstarUpdatedDropdown {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jetstar.com/nz/en/home?adults=1&children=0&flexible=1&flight-type=2&infants=0&origin=DUD&tab=1");
        driver.findElement(By.xpath("//div[@class=' mps__row flightTypeTravellers']/div/div[2]")).click();
        for(int i=1;i<5;i++)
        {
            driver.findElement(By.xpath("//div[@class='counters vanilla']/div[1]/div[2]/div[1]/button[2]")).click();
        }
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();

    }
}
