package Testy;

import org.openqa.selenium.WebElement;

public abstract class AbstractPage {
    public void keysSendToClearField(WebElement e, String text){
        e.clear();
        e.sendKeys(text);
    }

}
