package orangehrmlive;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) { // main method
        String baseurl = "https://opensource-demo.orangehrmlive.com"; // storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); // setting webdriver
        WebDriver driver= new ChromeDriver(); // creating object of chrome webdriver
        driver.get(baseurl); // method to invite url
        driver.manage().window().maximize();// maximising window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String title=driver.getTitle(); // storing title
        System.out.println("Title of the page:"+title); // printing title in console
        String url= driver.getCurrentUrl(); // getting url
        System.out.println("Current url:"+url); // printing url in console
        String source=driver.getPageSource(); // getting console
        System.out.println("page source:"+ source);// printing source in console
        WebElement usernameField=driver.findElement(By.name("username"));// storing usernamefield
        usernameField.sendKeys("Admin"); // sending keys to username field
        WebElement passwordField=driver.findElement(By.name("password")); // storing passwordfield
        passwordField.sendKeys("admin123"); // sending keys to password field
        //driver.close(); // closing browser




    }
}
