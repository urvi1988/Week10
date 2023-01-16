package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.time.Duration;

public class MultiBrowsing {
    static String browser = "Firefox";
    static String baseURL = "https://www.saucedemo.com/";
    static WebDriver driver;

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.geco.driver", "src/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }  else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/drivers/msedgedriver.exe");
            WebDriver driver = new EdgeDriver();
        }else{
        System.out.println("not valid browser ");
    }
        driver.get(baseURL);
        driver.manage().window().maximize(); // maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout session
        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page:" + title); // print title
        String url = driver.getCurrentUrl(); // storing url
        System.out.println("Current url:" + url); // print url
        String Source = driver.getPageSource(); // storing source
        System.out.println("page source:+source"); // print source
        WebElement usernameField = driver.findElement(By.name("user-name")); // storing username field
        usernameField.sendKeys("problem_user"); // send keys to username field
        WebElement passwordField = driver.findElement(By.name("password")); // storing password field
        passwordField.sendKeys("secret_sauce"); // sendkeys to password field
        //driver.close(); // closing browser

    }
}
