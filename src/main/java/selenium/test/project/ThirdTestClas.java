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
        driver.get("https://pl.pinterest.com/");
    }

    @Test
    public void successLoginTest() {
        driver.findElement(By.id("email")).sendKeys("igk44500@cndps.com");
        driver.findElement(By.id("password")).sendKeys("haslo1");
        driver.findElement(By.xpath("//html/body/div[1]/div/div/div[2]/div/div/div[3]/div/div[1]/div/div/div[1]/div/div/div[1]/div[4]/div/div[1]/form/div[3]/button/div")).click();

        Assert.assertTrue(
                driver.findElement( By.xpath("//*[@id=\"HeaderContent\"]/div[1]/div/div/div[2]/div/div/div[3]/div[1]")).isDisplayed());
    }




    @AfterClass
    public void tearDown() {
        //Zamknięcie przeglądarki
        driver.quit();
    }
}