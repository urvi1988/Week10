package herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.sql.Driver;
import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) { // main method
        String baseurl= "http://the-internet.herokuapp.com/login"; // storing base url
        System.setProperty("Webdriver.edge.driver","src/drivers/msedgedriver.exe"); // setting webdriver
        WebDriver driver= new EdgeDriver(); // creating object of chrome webdriver
        driver.get(baseurl); // method to invite url
        driver.manage().window().maximize(); // maximizing window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // time session
        String title= driver.getTitle();// storing title
        System.out.println("Title of the page:"+ title); // printing title in console
        String url= driver.getCurrentUrl(); // getting url
        System.out.println("Current url:"+url); // printing url in console
        String source=driver.getPageSource(); // getting source
        System.out.println("page source:"+ source); // printing source
        WebElement usernameField=driver.findElement(By.name("username")); // storing email field
        usernameField.sendKeys("Urvi.sft@gmail.com"); //  sending keys to email id field
        WebElement passwordField= driver.findElement(By.name("password")); // storing password field
        passwordField.sendKeys("saibaba1@"); // sendkeys to password field
        driver.close(); // closing browser



    }
}
