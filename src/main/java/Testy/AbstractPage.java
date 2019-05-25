package Testy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractPage {

    private static WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }


    public void keysSendToClearField(WebElement e, String text){
        e.clear();
        e.sendKeys(text);
    }

}
