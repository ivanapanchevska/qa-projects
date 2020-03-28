import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreateAnAccount {

    @Test
    public void testAccountCreation() {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\Chrome Drivers\\ChromeDriver 80.0.3987.16\\ChromeDriver 80.0.3987.16.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://automationpractice.com/index.php");
        chromeDriver.manage().window().maximize();
        chromeDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        chromeDriver.findElement(By.linkText("Sign in")).click();
        chromeDriver.findElement(By.id("email_create")).sendKeys("ivana.panchevska3@yahoo.com");
        chromeDriver.findElement(By.name("SubmitCreate")).click();
        chromeDriver.findElement(By.id("id_gender2")).click();
        chromeDriver.findElement(By.id("customer_firstname")).sendKeys("Ivana");
        chromeDriver.findElement(By.id("customer_lastname")).sendKeys("Panchevska");
        chromeDriver.findElement(By.id("passwd")).sendKeys("ivanapanchevska123");
        chromeDriver.findElement(By.id("days")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"days\"]/option[14]")).click();
        chromeDriver.findElement(By.id("months")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"months\"]/option[6]")).click();
        chromeDriver.findElement(By.id("years")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"years\"]/option[37]")).click();
        chromeDriver.findElement(By.id("optin")).click();
        chromeDriver.findElement(By.id("optin")).sendKeys("Seavus");
        chromeDriver.findElement(By.id("address1")).sendKeys("blv.Jane Sandanski");
        chromeDriver.findElement(By.id("address2")).sendKeys("number 8");
        chromeDriver.findElement(By.id("city")).sendKeys("Skopje");
        chromeDriver.findElement(By.id("id_state")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"id_state\"]/option[6]")).click();
        chromeDriver.findElement(By.id("postcode")).sendKeys("10000");
        chromeDriver.findElement(By.id("other")).sendKeys("Be safe, Stay home!");
        chromeDriver.findElement(By.id("phone")).sendKeys("3892555555");
        chromeDriver.findElement(By.id("phone_mobile")).sendKeys("072333333");
        chromeDriver.findElement(By.id("submitAccount")).click();

    }
}
