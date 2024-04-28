package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

// brands menusune gidin çıkan harflerle baş harflerinin öylemi başlıyor kontrol et
public class _01_TODO extends BaseDriver {

    @Test
    public void BrandsValidation() {
        WebElement brands = driver.findElement(By.linkText("Brands"));
        brands.click();

        List<WebElement> Harfler = driver.findElements(By.xpath("//div[@id='content']/h2 "));
        List<WebElement> MarkalarSatirlari = driver.findElements(By.xpath("//div[@id='content']/div ")); // markaSatirları

        for (int i = 0; i < Harfler.size() ; i++) {

            List<WebElement> markalar=MarkalarSatirlari.get(i).findElements(By.tagName("div"));        // element içinde aranırken xpath kullanılmaz

            for (WebElement marka:markalar){
                System.out.println(Harfler.get(i).getText()+" "+marka.getText().charAt(0)+" "+marka.getText());// harfi veriypr
                Assert.assertEquals(Harfler.get(i).getText().charAt(0),marka.getText().charAt(0));
            }

        }


// TODO : istiyenler aynı soru olarak ebay.com/n/all-brands bu sitedeb test edebilir.
    }
}
