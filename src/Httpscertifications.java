import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Httpscertifications {
    public static void main(String[] args) {
        DesiredCapabilities ch=DesiredCapabilities.chrome();
        ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        ChromeOptions c=new ChromeOptions();
        c.merge(ch);
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(c);
       // driver.manage().window().maximize();
       // driver.manage().deleteAllCookies();
        // driver.manage().deleteCookieNamed("session key");
    }
}
