package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) { // predefine method
        String baseurl = "https://www.saucedemo.com/"; // storing base url
        System.setProperty("Webdriver.edge.driver", "src/driveres/msedgedriver.exe");//
        WebDriver driver = new EdgeDriver(); // creating objct
        driver.get(baseurl); // invite url
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
        driver.close(); // closing browser
    }
}
