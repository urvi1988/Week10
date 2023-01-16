package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) { // predefine method
        String baseurl= "http://the-internet.herokuapp.com/login"; // storing base url
        System.setProperty("Webdriver.chrome.driver","src/drivers/chromedriver.exe");// setting webdriver
        WebDriver driver = new ChromeDriver();// creating object from chrome webdriver
        driver.get(baseurl); // method to invite url
        driver.manage().window().maximize();// maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// time out session
        String title = driver.getTitle();// storing title
        System.out.println("Title of the page:"+title); // printing title in console
        String url= driver.getCurrentUrl();// getting url
        System.out.println("Current url:"+url); // printing url in console
        String source=driver.getPageSource();// getting source
        System.out.println("page source:"+ source); // printing source
        WebElement emailIdField = driver.findElement(By.name("username")); // storing email field
        emailIdField.sendKeys("urvi.sft@gmail.com"); // sending keys to email id field
        WebElement passwordField= driver.findElement(By.name("password")); // storing password field
        passwordField.sendKeys("saibaba1@"); // sendkeys to password field
         driver.close(); // closing browser

    }
}
