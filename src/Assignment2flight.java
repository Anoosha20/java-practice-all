import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2flight {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.cleartrip.com/");
        driver.findElement(By.id("OneWay")).click();
        driver.findElement(By.id("DepartDate")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight ")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("Adults")).click();
        Select s=new Select( driver.findElement(By.id("Adults")));
        s.selectByValue("2");
        driver.findElement(By.id("Childrens")).click();
        Select c=new Select(driver.findElement(By.id("Childrens")));
        c.selectByValue("1");
        Thread.sleep(2000);
        driver.findElement(By.id("MoreOptionsLink")).click();
        driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
        driver.findElement(By.id("SearchBtn")).click();
        System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());



    }
}
