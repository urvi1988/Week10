package NopCommerece;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) { // pre define method
        String baseurl="https://demo.nopcommerce.com/login?returnUrl=%2F"; // storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); // setting webdriver
        WebDriver driver=new ChromeDriver(); // creating object of chrome webdriver
        driver.get(baseurl); // method to invite url
        driver.manage().window().maximize(); // maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25)); // timeout session
        String title= driver.getTitle();// storing title
        System.out.println("Title of the page:"+ title); // printing title in console
        String url= driver.getCurrentUrl(); // getting url
        System.out.println("Current url:"+url);
        driver.findElement(By.className("ico-login")).click();// cliking on login link
        WebElement emailIdField= driver.findElement(By.id("Email"));// storing email field
        emailIdField.sendKeys("urvi.sft@gmail.com");// sending keys to email id  field
        WebElement passwordField= driver.findElement(By.id("Password")); // storing password field
        passwordField.sendKeys( "saibaba1@");// sendkeys to password field
        driver.close(); // closing browser
    }
}
