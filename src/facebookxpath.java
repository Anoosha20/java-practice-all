import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebookxpath {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
       /* driver.findElement(By.xpath("//input[@type='email']")).sendKeys("own path");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hgdjk");
        driver.findElement(By.xpath("//input[@value='Log In']")).click();*/
       driver.findElement(By.cssSelector("input[name='email']")).sendKeys("hai css");
       driver.findElement(By.cssSelector("[value='Log In']")).click();

    }
}
