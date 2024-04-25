package Gun04;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/* siteyi  açın search de mac yazıp aratın çıkan sonuçlarda hepsi mac mi kontrol edin.
* */
public class _01_SearchFunctionality extends BaseDriver {
    @Test
    @Parameters("Mesaj")
    public void Test(String GelenMesaj){
        WebElement Search=driver.findElement(By.name("search"));
        Search.sendKeys(GelenMesaj + Keys.ENTER);



        List<WebElement> captions=  driver.findElements(By.cssSelector("[class='caption'] > h4"));

        for (WebElement e: captions) {
         //   System.out.println("e.getText() = " + e.getText());
            MyFunc.Bekle(2);
        Assert.assertTrue(e.getText().toLowerCase().contains(GelenMesaj));
        }


    }
}
