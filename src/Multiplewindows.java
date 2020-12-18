import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Multiplewindows {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://accounts.google.com/");
        driver.findElement(By.xpath("//a[contains(text(), 'Help')]")).click();
        System.out.println("Before Switching");
        System.out.println(driver.getTitle());
        Set<String> ids=driver.getWindowHandles();
        Iterator<String> it=ids.iterator();
        String parentid=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println("After Switching");
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);
        System.out.println("switching back to the parent");
        System.out.println(driver.getTitle());
    }
}
