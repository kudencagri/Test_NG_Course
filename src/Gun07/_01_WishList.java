package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

// siteye gir ipodu ara xml den gönderecez  rastlege wish listeye ekle  sonra kontrol et
public class _01_WishList extends BaseDriver {

    @Test
    @Parameters("searchText")
    public void WishList(String aranacakKelime){
        WebElement search=driver.findElement(By.name("search"));
        search.sendKeys(aranacakKelime + Keys.ENTER);

        List<WebElement> wishButton=driver.findElements(By.xpath("//button[@data-original-title='Add to Wish List']")); // wish butonları
        List<WebElement> productList=driver.findElements(By.xpath("//div[@class='caption']//h4"));// ürünlerin başlıkları

        int randomSecim= MyFunc.randomGenerator(wishButton.size());// random sayı üretildi
        String wishItemText=productList.get(randomSecim).getText();// random daki ürün adı alındı
        System.out.println("wishItemText = " + wishItemText);// kontrol için yazıldı

        wishButton.get(randomSecim).click();// ilgili random ürünün wish butonuna tıklandı

        WebElement wishListLink= driver.findElement(By.xpath("//span[contains(text(),'Wish List')]"));
        wishListLink.click();

        //wish liste giridli
        List<WebElement> wishList=driver.findElements(By.xpath("//td[@class='text-left']/a"));

        //aradığımız ürün listede var mı yok mu?
        boolean bulundu=MyFunc.listContainsString(wishList, wishItemText);

        Assert.assertTrue(bulundu,"wish listede atanan ürün bulunmadı");
    }
}
