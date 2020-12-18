import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://login.salesforce.com");
        driver.findElement(By.cssSelector("input[id='username']")).sendKeys("hai sales");
        driver.findElement(By.cssSelector("input[id='password']")).sendKeys("hai pass");
        driver.findElement(By.xpath("//input[@id='Login']")).click();
    }
}
