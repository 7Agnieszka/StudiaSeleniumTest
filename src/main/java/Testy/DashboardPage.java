package Testy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends AbstractPage {

    WebDriver driver;

    @FindBy (css = "#content > div:nth-child(2) > nav > div > div.site-auth.hidden-xs > a > img" )
    WebElement logoutButton;

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public String logoutImageAlt() {
        return logoutButton.getAttribute("alt");
    }
}