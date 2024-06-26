package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;        // seleniumdan farkı annotaion kullanalarak basedriver ekledik

public class BaseDriver {
    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;
    @BeforeClass
    public void BaslangicIslemleri(){

        Logger logger= Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        loginTesti();
    }

    public void loginTesti(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement Input_email=driver.findElement(By.id("input-email"));
        Input_email.sendKeys("cagricanra@gmail.com");

        WebElement Input_Password=driver.findElement(By.id("input-password"));
        Input_Password.sendKeys("21tekno43");

        WebElement button=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        button.click();

        Assert.assertTrue(driver.getTitle().equals("My Account"));
    }
    @AfterClass
    public void BitisIslemleri(){
        MyFunc.Bekle(5);
        driver.quit();
    }
}
