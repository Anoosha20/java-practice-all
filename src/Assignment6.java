import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qaclickacademy.com/practice.php");
        driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
        String selectedText=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
        WebElement dropdown=(driver.findElement(By.id("dropdown-class-example")));
        Select s=new Select(dropdown);
        s.selectByVisibleText(selectedText);
        driver.findElement(By.id("name")).sendKeys(selectedText);
        driver.findElement(By.id("alertbtn")).click();
        String text=driver.switchTo().alert().getText();
        if(text.contains(selectedText))
        {
            System.out.println("alert message  success");
        }
        else
        {
            System.out.println("alert message is not success");
        }
    }
}
