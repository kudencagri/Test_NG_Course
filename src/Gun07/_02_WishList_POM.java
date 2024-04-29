package Gun07;

import Gun06._04_PlaceOrder_ELementleri;
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
public class _02_WishList_POM extends BaseDriver {

    @Test
    @Parameters("searchText")
    public void WishList(String aranacakKelime){
        _03_WishListElement wle=new _03_WishListElement();

        wle.searchBox.sendKeys(aranacakKelime+ Keys.ENTER);
        int randomSecim= MyFunc.randomGenerator(wle.wishButton.size());// random sayı üretildi
        String wishItemText=wle.productList.get(randomSecim).getText();// random daki ürün adı alındı
        wle.wishButton.get(randomSecim).click();// ilgili random ürünün wish butonuna tıklandı
        wle.wishListLink.click();


        //aradığımız ürün listede var mı yok mu?
        boolean bulundu=MyFunc.listContainsString(wle.wishList, wishItemText);
        Assert.assertTrue(bulundu,"wish listede atanan ürün bulunmadı");
    }
}
