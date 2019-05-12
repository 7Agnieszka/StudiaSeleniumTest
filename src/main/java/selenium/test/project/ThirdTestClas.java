package selenium.test.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ThirdTestClas {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Wskazanie zewnętrznego pliku drivera dla przeglądarki CHROME
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\zp114278\\Desktop\\chromedriver.exe"
        );
        //Stworzenie i zainicjalizowanie obiektu DRIVER przeglądarką CHROME
        driver = new ChromeDriver();
        // Ustawienie globalnego timeouta na 5 sekund
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // Ustawienie zmaksymalizowanego okna
        driver.manage().window().maximize();
        // przejście na wskazaną stronę
        driver.get("https://secure.last.fm/login");
    }

    @Test
    public void successLoginTest() {

        driver.findElement(By.id("id_username")).sendKeys("Aga111222");
        driver.findElement(By.id("id_password")).sendKeys("haslo1!");
        driver.findElement(By.cssSelector("#login > div:nth-child(5) > div > button")).click();

        Assert.assertTrue(driver.findElement( By.cssSelector("#content > div:nth-child(2) > nav > div > div.site-auth.hidden-xs > a > img")).isDisplayed());
    }




    @AfterClass
    public void tearDown() {
        //Zamknięcie przeglądarki
        driver.quit();
    }
}