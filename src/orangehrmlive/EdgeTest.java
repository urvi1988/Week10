package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) { // main method
        String baseURL = "https://opensource-demo.orangehrmlive.com/"; // storing base url
        System.setProperty("WebDriver.edge.driver","src/drivers/msedgedriver.exe"); // setting webdriver
        WebDriver driver= new EdgeDriver(); // creating object of chrome webdriver
        driver.get(baseURL); // method to invite url
        driver.manage().window().maximize(); // maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // timeout session
        String title=driver.getTitle(); // storing title
        System.out.println("Title of the page:"+title); // printing title in console
        String url=driver.getCurrentUrl(); // getting url
        System.out.println("Current URL:"+url);
        String source=driver.getPageSource(); // getting console
        System.out.println("page source:"+ source);// printing source in console
        WebElement usernameField=driver.findElement(By.name("username")); // storing email field
        usernameField.sendKeys("Admin"); // sending keys to email id field
        WebElement passwordField=driver.findElement(By.name("password")); // storing password field
        passwordField.sendKeys("admin123"); // send keys to password field
        driver.close(); // closing browser


    }
}
