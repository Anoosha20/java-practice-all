import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Calendermakemytrip {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//div[3]//label[1]")).click();
        while(!driver.findElement(By.xpath("//div[@class='DayPicker-Month']/div[1]")).getText().contains("February"))
        {
            driver.findElement(By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next")).click();
        }
        List<WebElement> dates=driver.findElements(By.className("DayPicker-Day"));
        int count=driver.findElements(By.className("DayPicker-Day")).size();
        for(int i=0;i<count;i++)
        {
            String text=driver.findElements(By.className("DayPicker-Day")).get(i).getText();
            if(text.equalsIgnoreCase("29"))
            {
                driver.findElements(By.className("DayPicker-Day")).get(i).click();
                break;

            }
        }
    }
}
