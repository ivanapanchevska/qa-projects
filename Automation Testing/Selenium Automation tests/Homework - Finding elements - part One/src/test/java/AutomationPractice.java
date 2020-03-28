import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationPractice {

    @Test
    public void testSignIn() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\Chrome Drivers\\ChromeDriver 80.0.3987.16\\ChromeDriver 80.0.3987.16.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://automationpractice.com/index.php");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.linkText("Sign in")).click();
        chromeDriver.findElement(By.partialLinkText("Sign")).click();
        chromeDriver.quit();
    }


    @Test
    public void testShoppingLinkClick() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\Chrome Drivers\\ChromeDriver 80.0.3987.16\\ChromeDriver 80.0.3987.16.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://automationpractice.com/index.php");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.cssSelector("a[title*=shopping]")).click();
        chromeDriver.quit();
    }

    @Test
    public void testSubCategoryClick() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\Chrome Drivers\\ChromeDriver 80.0.3987.16\\ChromeDriver 80.0.3987.16.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://automationpractice.com/index.php");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.xpath("//a[starts-with(@title, 'View')]")).click();
        chromeDriver.findElement(By.xpath("//a[text()='Women']")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"subcategories\"]/ul/li[1]/div[1]/a/img")).click();
        chromeDriver.quit();
    }

}
