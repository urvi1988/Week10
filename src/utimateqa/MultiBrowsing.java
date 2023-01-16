package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowsing {
    static String browser="Chrome";
    static String baseurl= "https://courses.ultimateqa.com/users/sign_in";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
            driver=new ChromeDriver();

        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
        }else{
            System.out.println("not valid browser ");
        }
        driver.get(baseurl); // method to invite url
        driver.manage().window().maximize(); // maximizing windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(35)); // time out session
        String title= driver.getTitle(); // storing title
        System.out.println("Title of the page:"+title); // printing title in console
        String url= driver.getCurrentUrl(); // getting url
        System.out.println("Current url:"+url);
        String Source= driver.getPageSource(); // storing source
        System.out.println("page source:+source"); // print source
        WebElement emailField= driver.findElement(By.id("user[email]")); // storing email
        emailField.sendKeys("urvi.sft@gmail.com"); // sending key to email field
        WebElement passwordField=driver.findElement(By.id("user[password]")); // storing password
        passwordField.sendKeys("saibaba1@"); // sendkeys to password
        driver.close(); // closing browser


    }
}
