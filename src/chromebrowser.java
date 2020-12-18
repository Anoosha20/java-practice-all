import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowser {

    public static void main(String[] args) {
 /* Class name= X
                X driver=new X(); */
        System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
        //driver.findElement(By.className("inputtext")).sendKeys(" hai ");
        /*driver.findElement(By.id("email")).sendKeys("this is my first code");
        driver.findElement(By.name("pass")).sendKeys("123456");
        driver.findElement(By.linkText("Forgotten account?")).click();*/
        driver.findElement(By.cssSelector("#email")).sendKeys("email adress");
        driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("password");

    }

}
