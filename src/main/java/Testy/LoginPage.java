package Testy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AbstractPage {

    WebDriver driver;

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement loginField;

    @FindBy(id = "login")
    WebElement loginButon;


    public LoginPage(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(this.driver,this);

    }


    public LoginPage fillLoginForm(String username, String password) {
       keysSendToClearField(emailField, username);
       keysSendToClearField(loginField, password);
        return this;
    }


    public DashboardPage submitLoginForm() {
        //driver.findElement(By.cssSelector("#login > div:nth-child(5) > div > button")).click();
        loginButon.click();
        return new DashboardPage(driver);
    }
}