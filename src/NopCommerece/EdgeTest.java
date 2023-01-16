package NopCommerece;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) { // main methdod
        String baseurl = "https://demo.nopcommerce.com/"; // storing base url
        System.setProperty("Webdriver.edge.driver", "src/driveres/msedgedriver.exe"); // setting webdriver
        WebDriver driver = new EdgeDriver(); //  creating object
        driver.get(baseurl); // method to invite url
        driver.manage().window().maximize(); // maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25)); // timeout session
        String title= driver.getTitle();// storing title
        System.out.println("Title of the page:"+ title); // printing title in console
        String url= driver.getCurrentUrl(); // getting url
        System.out.println("Current url:"+url); // printing url
        driver.findElement(By.className("ico-login")).click();// cliking on login link
        WebElement emailIdField= driver.findElement(By.id("Email"));// storing email field
        emailIdField.sendKeys("urvi.sft@gmail.com");// sending keys to email id  field
        WebElement passwordField= driver.findElement(By.id("Password")); // storing password field
        passwordField.sendKeys( "saibaba1@");// sendkeys to password field
        driver.close(); // closing browser
    }
}