import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class google {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.xpath("//div[@class='SDkEP']/div/input")).sendKeys("hai  google");
        /*driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();*/
        //driver.findElement(By.xpath("//div[@class='gb_ce gb_g gb_Bg gb_sg']/div[2]/a")).click();
    }
}
