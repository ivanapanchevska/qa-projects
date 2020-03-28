import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementsBy {

    @Test
    public void findElementByClassName() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\Chrome Drivers\\ChromeDriver 80.0.3987.16\\ChromeDriver 80.0.3987.16.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://automationpractice.com/index.php");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.className("login")).click();
        chromeDriver.quit();
    }


    @Test
    public void findElementByName() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\Chrome Drivers\\ChromeDriver 80.0.3987.16\\ChromeDriver 80.0.3987.16.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.name("SubmitCreate")).click();
        chromeDriver.quit();
    }

    @Test
    public void findElementById() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\Chrome Drivers\\ChromeDriver 80.0.3987.16\\ChromeDriver 80.0.3987.16.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://automationpractice.com/index.php");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.id("contact-link")).click();
        chromeDriver.quit();
    }


    @Test
    public void findElementByTagName() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\Chrome Drivers\\ChromeDriver 80.0.3987.16\\ChromeDriver 80.0.3987.16.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("http://automationpractice.com/index.php");
        chromeDriver.manage().window().maximize();
        chromeDriver.findElement(By.tagName("a")).click();
        chromeDriver.quit();
    }

}
