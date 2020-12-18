import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.qaclickacademy.com/practice.php");
        driver.findElement(By.id("autocomplete")).click();
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("unit");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
        JavascriptExecutor js=(JavascriptExecutor)driver;
        String text="return document.getElementById(\"autocomplete\").value;";
        String actualText= (String) js.executeScript(text);
        System.out.println(actualText);
        int i=0;
        while(!actualText.equalsIgnoreCase("United States"))
        {
            i++;
            driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
            actualText= (String) js.executeScript(text);
            System.out.println(actualText);
            if(i>5)
            {
                break;
            }

        }


    }
}
