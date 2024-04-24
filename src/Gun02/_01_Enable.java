package Gun02;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _01_Enable {
    @Test
    public void test1(){ System.out.println("Test1 çalıştı"); }

    @Test(enabled = false)
    public void test2(){ System.out.println("Test2 çalıştı"); }

    @Test
    public void test3(){ System.out.println("Test3 çalıştı"); }

    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;
    @BeforeClass
    public void BaslangicIslemleri(){

        Logger logger= Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        System.out.println("Baslangıc işlermleri çalıştı");
    }
    @AfterClass
    public void BitisIslemleri(){
        MyFunc.Bekle(5);
        driver.quit();
        System.out.println("Bitiş işlemleri çalıştı");
    }
}
