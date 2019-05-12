package Testy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public LoginPage fillLoginForm(String username, String password) {
        driver.findElement(By.id("id_username")).sendKeys(username);
        driver.findElement(By.id("id_password")).sendKeys(password);
        return this;
    }

    public DashboardPage submitLoginForm() {
        driver.findElement(By.cssSelector("#login > div:nth-child(5) > div > button")).click();
        return new DashboardPage(driver);
    }
}