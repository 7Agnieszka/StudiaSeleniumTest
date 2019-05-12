package Testy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String logoutImageAlt() {
        return driver.findElement(
                By.cssSelector("#content > div:nth-child(2) > nav > div > div.site-auth.hidden-xs > a > img"))
                .getAttribute("alt");
    }
}