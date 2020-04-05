import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.ArrayList;

/**
 * With exercise we tried to login and send mail on Gmail.
 */
public class LoginOnGmailAndSendMail {

    //we declare them here so we can use them in multiple methods
    public static WebDriver chromeDriver;

    //declare Wait WebDriver
    WebDriverWait wait;

    //Declare Soft Assertion
    SoftAssert softAssert = new SoftAssert();



    //This class will perform execution of test cases which will test only on Google Chrome
    //so knowing this, we will use @BeforeClass annotation for this method in which we will
    //initialize the driver and set property, meaning this setup will be valid for every method in this class
    @BeforeClass
    public void driverSetProperty() {
        System.out.println("Execution in: @BeforeClass.");
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium WebDrivers\\Chrome Drivers\\ChromeDriver 80.0.3987.16\\ChromeDriver 80.0.3987.16.exe");
        chromeDriver = new ChromeDriver();
    }


    @BeforeClass
    public static void openGmail() {
        chromeDriver.manage().window().maximize();
        chromeDriver.get("https://www.google.com/gmail/");

        //click on 'Sign In' on Gmail
        chromeDriver.findElement(By.linkText("Sign in")).click();
    }

    @BeforeMethod
    public void loginToGmail() {
        //find 'Input Username' placeholder, send username to placeholder and click next

        chromeDriver.findElement(By.id("identifierId")).sendKeys("finalseleniumproject@gmail.com");
        chromeDriver.findElement(By.id("identifierNext")).click();

        //set wait time until load 'password' input
        wait = new WebDriverWait(chromeDriver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type = 'password']")));

        chromeDriver.findElement(By.name("password")).sendKeys("Final7eleniumproject");
        chromeDriver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();

    }

    @Test
    public void sendMail() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Compose')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("to"))).sendKeys("viktor.petkovski@seavus.com");
        chromeDriver.findElement(By.name("subjectbox")).sendKeys("Final Selenium Project: Viktor Petkovski");
        chromeDriver.findElement(By.xpath("//*[@class=\"Ar Au\"]/div/div")).sendKeys("We are just starting with Selenium! Best regards from Ivana Panchevska.");
        chromeDriver.findElement(By.xpath("//div[text()='Send']")).click();
    }


    @AfterMethod
    public void checkIfMailHasSent() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@title,'Sent')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@email, 'viktor.petkovski@seavus.com')]")));
        WebElement sentMail = chromeDriver.findElement(By.xpath("//span[contains(text(), 'Viktor Petkovski')]"));
        softAssert.assertEquals(true, sentMail.isDisplayed());
        chromeDriver.close();

        //optional console output messages
        System.out.println("*****AfterMethod*****");
        System.out.println("Successfully sent mail!");
        System.out.println("Confirmation of sent email was performed using Assertions.");
        System.out.println("The browser session was closed.");
        System.out.println("-------------------------------------------");
    }

    @AfterClass
    public void quitDriver(){
        chromeDriver.quit();
    }
}
