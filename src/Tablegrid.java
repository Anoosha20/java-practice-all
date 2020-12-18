import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablegrid {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        int sum=0;
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22977/afg-vs-wi-3rd-t20i-afghanistan-v-west-indies-in-india-2019");
        WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        int rowcount=table.findElements(By.cssSelector(".cb-col cb-col-100.cb-scrd-itms")).size();
        int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        for(int i=0;i<count-2;i++)
        {
            String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
            int valueInteger=Integer.parseInt(value);
            sum=sum+valueInteger;

           // System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
        }
        System.out.println(sum);
        String extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
        int extrasValue=Integer.parseInt(extras);
        int totalSumValue=extrasValue+sum;
        System.out.println(totalSumValue);
        String actualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
        int actualTotalValue=Integer.parseInt(actualTotal);
        if(actualTotalValue==totalSumValue)
        {
            System.out.println("Count matches");
        }
        else
        {
            System.out.println("Count fails");
        }
       // System.out.println(driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText());
        //System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
    }
}
