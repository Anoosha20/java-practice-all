import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortingAscDscTableColumns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
        driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
       List<WebElement> firstColList=driver.findElements(By.xpath("//tr/td[2]"));
        ArrayList<String> originalList=new ArrayList<String>();
        for(int i=0;i<firstColList.size();i++)
        {
            originalList.add(firstColList.get(i).getText());
        }
        ArrayList<String > copiedList=new ArrayList<String>();
        for (int i=0;i<originalList.size();i++) {
            copiedList.add(originalList.get(i));
        }
        System.out.println();
        Collections.sort(copiedList);
        //Collections.reverse(copiedList);
        for(String s:copiedList)
        {
            System.out.println(s);
        }
        for(String s:originalList)
        {
            System.out.println(s);
        }
        Assert.assertTrue(originalList.equals(copiedList));



    }
}
