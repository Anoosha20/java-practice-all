import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class Tr {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.airnewzealand.co.nz/");
            WebElement source=driver.findElement(By.id("depart-from"));
            source.clear();
            source.sendKeys("Au");
            source.sendKeys(Keys.ENTER);
            WebElement destination=driver.findElement(By.id("depart-to"));
            destination.clear();
            destination.sendKeys("We");
            destination.sendKeys(Keys.ENTER);
            driver.findElement(By.id("field-search-journey-type-oneway")).click();
            driver.findElement(By.xpath("//div[@id='search-leavedate']/div/span")).click();
            driver.findElement(By.cssSelector(".selected.startdate")).click();
          //  driver.findElement(By.xpath("//div[contains(@class,'selected startdate')")).click();
            for(int i=0;i<3;i++) {
              driver.findElement(By.xpath("//div[@id='adultcount-stepper']/div[1]/button[2]")).click();
           //driver.findElement(By.xpath("//button[@name='add adult']")).click();
            }

            driver.findElement(By.xpath("//button[@type='submit']")).click();



        }
    }


