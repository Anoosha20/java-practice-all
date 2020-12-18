import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.sql.SQLOutput;

public class app {
    public static void main(String[] args) {
        System.out.println("Hello JAVA");
        /* Class name= X
                X driver=new X(); */
        System.setProperty("webdriver.chrome.driver" ,"C:\\Program Files\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());
        driver.get("http://www.yahoo.com/");
       // driver.navigate().back();
       // driver.navigate().forward();
        driver.close();
       // driver.quit();



    }

}
