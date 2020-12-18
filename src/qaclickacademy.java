import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class qaclickacademy {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.qaclickacademy.com/interview.php");
driver.findElement(By.xpath("//section[@id='content']/div/div/div/div/ul/li[1]")).click();
        //driver.findElement(By.xpath("//li[@id='tablist1-tab1']")).click();
       // driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
       // driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[2]")).click();
        //driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[3]")).click();
        System.out.println(driver.findElement(By.xpath("//li[@id='tablist1-tab1']/parent::ul")).getAttribute("role"));
        //driver.findElement(By.xpath("//li[text()=' Testing ']")).click();
    }
}
