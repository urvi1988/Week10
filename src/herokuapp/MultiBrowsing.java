package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser="Chrome";
    static String baseURL= "http://the-internet.herokuapp.com/login";
    static WebDriver driver;

    public static void main(String[] args) {
        if(browser.equalsIgnoreCase( "Chrome")) {
            System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe");
            driver = new ChromeDriver();

        } else if(browser.equalsIgnoreCase( "Firefox")) {
            System.setProperty("webdriver.gecko.driver","src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();

        }else if(browser.equalsIgnoreCase( "edge")) {
            System.setProperty("webdriver.edge.driver","src/drivers/msedgedriver.exe");
            WebDriver driver= new EdgeDriver();
        }else {
            System.out.println("not valid");
        }
        driver.get(baseURL); // method to invite url
        driver.manage().window().maximize();// maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));// time out session
        String title = driver.getTitle();// storing title
        System.out.println("Title of the page:"+title); // printing title in console
        String url= driver.getCurrentUrl();// getting url
        System.out.println("Current url:"+url); // printing url in console
        String source=driver.getPageSource();// getting source
        WebElement usernameField= driver.findElement(By.name("username")); // storing email field
        usernameField.sendKeys("urvi.sft@gmail.com"); // sending keys to email id field
        WebElement passwordField=driver.findElement(By.name("password")); // storing password field
        passwordField.sendKeys("saibaba1@"); // send keys to password field
        driver.close(); // closing browser

    }
}
