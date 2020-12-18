import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        WebElement table=driver.findElement(By.id("product"));
        System.out.println(table.findElements(By.tagName("tr")).size());
        System.out.println(table.findElements(By.tagName("th")).size());
        WebElement count=driver.findElement(By.xpath("//table[@id='product']/tbody/tr[3]"));
        System.out.println(count.findElement(By.xpath("//td[text()='Rahul Shetty']")).getText());
        System.out.println(count.findElement(By.xpath("//td[text()='Rahul Shetty']/following-sibling::td")).getText());
        System.out.println(count.findElement(By.xpath("//td[text()='Rahul Shetty']/following-sibling::td[2]")).getText());

    }
}
