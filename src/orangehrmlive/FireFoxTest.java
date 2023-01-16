package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) {  // main method
        String baseurl="https://opensource-demo.orangehrmlive.com/"; // storing base url
        System.setProperty("webdriver.geco.driver","src/drivers/geckodriver.exe"); // setting webdriver
        WebDriver driver= new FirefoxDriver(); // creating object of chrome webdriver
        driver.get(baseurl); // method to invite url
        driver.manage().window().maximize(); //maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session
        String title= driver.getTitle();// storing title
        System.out.println("Title of the page:"+ title); // printing title in console
        String url= driver.getCurrentUrl(); // getting url
        System.out.println("Current url:"+ url);
        String source=driver.getPageSource(); // getting console
        System.out.println("page source:"+ source);// printing source in console
        WebElement usernameField=driver.findElement(By.name("username")); // storing username
        usernameField.sendKeys("Admin"); // sending key to usernamefield
        WebElement passwordField= driver.findElement(By.name("password")); // storing password field
        passwordField.sendKeys("admin123"); // send key to passwprd field
        driver.close(); // closing browser



    }
}
