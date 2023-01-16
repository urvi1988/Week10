package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFoxTest {
    public static void main(String[] args) { // main method
        String baseurl = "https://courses.ultimateqa.com/users/sign_in"; // storing base url
        System.setProperty("webdriver.geco.driver", "src/drivers/gecodriver.exe");// setting firefox webdriver
        WebDriver driver = new FirefoxDriver(); // creating object
        driver.get(baseurl); // method to invite url
        driver.manage().window().maximize(); // maximising windows
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));// timeout session
        String title = driver.getTitle(); // storing title
        System.out.println("Title of the page:" + title); // print title
        String url = driver.getCurrentUrl(); // storing url
        System.out.println("Current url:" + url); // print url
        String Source = driver.getPageSource(); // storing source
        System.out.println("page source:+source"); // print source
        WebElement emailField = driver.findElement(By.id("user[email]")); // storing email
        emailField.sendKeys("urvi.sft@gmail.com"); // sending key to email field
        WebElement passwordField = driver.findElement(By.id("user[password]")); // storing password
        passwordField.sendKeys("saibaba1@"); // sendkeys to password
        driver.close(); // closing browser

    }
}
