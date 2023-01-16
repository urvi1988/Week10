package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) { // main method
        String baseurl= "https://courses.ultimateqa.com/users/sign_in"; // storing base url
        System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver.exe"); // setting webdriver
        WebDriver driver= new ChromeDriver(); // creating object of chrome webdriver
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
