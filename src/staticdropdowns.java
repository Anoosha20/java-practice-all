import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.spicejet.com");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);


        driver.findElement(By.id("ctl00_mainContent_ddl_Adult")).click();
        Thread.sleep(2000);

        Select s = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
        s.selectByValue("3");
        s.selectByIndex(7);
        s.selectByVisibleText("9");

    }
}

