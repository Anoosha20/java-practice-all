import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Updateddropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.jetstar.com/nz/en/home?adults=1&children=0&flexible=1&flight-type=2&infants=0&origin=DUD&tab=1");
       driver.findElement(By.xpath("//div[@class='j1_j2']/div[2]/button")).click();

       /* while(i<5)
        {
            driver.findElement(By.xpath("//div[@data-test='counter-adults']/div/div/button[2]/i[1]")).click();
            i++;
        }*/
       for(int i=1;i<5;i++) {
         driver.findElement(By.xpath("//div[@data-test='counter-adults']/div/div/button[2]/i[1]")).click();

       }
        Thread.sleep(2000);
       /* driver.findElement(By.xpath("//button[text()='Confirm']")).click();*/

        driver.findElement(By.cssSelector(".hc_he.hc_hm")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='j1_j2']/div[2]/button")).getText(),"5 passengers");
    }
}
