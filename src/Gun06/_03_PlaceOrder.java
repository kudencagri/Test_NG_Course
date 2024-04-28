package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

/*siteyi açınız
* sitede "ipod" kelimesini aratınız
* çıkan sınuçlardan ilkini sepete atınız
* shopping Charta tıklayınız
* check out yapınız
* continue butonlarına tıklatıp bilgilerini giriniz
*  en son your has been placed çıktısını doğrulayın
* */
public class _03_PlaceOrder extends BaseDriver {

    @Test(priority = 1)
    public void Search(){

        WebElement search= driver.findElement(By.xpath("//input[@name='search']"));
        search.sendKeys("İpod"+ Keys.ENTER);
    }

    @Test(priority = 2)
    public void AddToCart(){
        WebElement addtoCart=driver.findElement(By.xpath("((//div[@class='button-group'])[1] /button)[1]"));
        addtoCart.click();

        WebElement shopingChart=driver.findElement(By.linkText("shopping cart"));
        shopingChart.click();

    }
    @Test(priority = 3)
    public void CheckOut(){
        WebElement checkout= driver.findElement(By.xpath("//div[@class='pull-right'] / a"));
        checkout.click();

        WebElement Continue=driver.findElement(By.xpath("//input[@id='button-account']"));
        Continue.click();

    }
    @Test(priority = 4)
    public void Isterler(){
        WebElement firstName= driver.findElement(By.id("input-payment-firstname"));
        firstName.sendKeys("Cagri");

        WebElement LastName=driver.findElement(By.id("input-payment-lastname"));
        LastName.sendKeys("kuden");

        WebElement Email=driver.findElement(By.id("input-payment-email"));
        Email.sendKeys("aslkdlk@gmail.com");

        WebElement phone= driver.findElement(By.id("input-payment-telephone"));
        phone.sendKeys("05384563212");

        WebElement  password=driver.findElement(By.id("input-payment-password"));
        password.sendKeys("asdqweasd123");

        WebElement Corpassword=driver.findElement(By.id("input-payment-confirm"));
        Corpassword.sendKeys("asdqweasd123");

        WebElement COmpany=driver.findElement(By.id("input-payment-company"));
        COmpany.sendKeys("Rast");

        WebElement adrres=driver.findElement(By.id("input-payment-address-1"));
        adrres.sendKeys("asdlşasdşl lşasdşl alşsdlş asdasd");

        WebElement Coadress=driver.findElement(By.id("input-payment-address-2"));
        Coadress.sendKeys("asdlşasdşl lşasdşl alşsdlş asdasd");

        WebElement City=driver.findElement(By.id("input-payment-city"));
        City.sendKeys("Diyarbkarı");

        WebElement PostaKodu=driver.findElement(By.id("input-payment-postcode"));
        PostaKodu.sendKeys("12331");


        WebElement Country=driver.findElement(By.xpath("//select[@id='input-payment-country']"));
        Select selectCountry=new Select(Country);
        selectCountry.selectByVisibleText("Turkey");

        WebElement SeCity=driver.findElement(By.xpath("//select[@name='zone_id']"));
        Select selectCity=new Select(SeCity);
        selectCity.selectByVisibleText("Diyarbakır");

        WebElement checkBox=driver.findElement(By.xpath("//*[@name='agree']"));
        checkBox.click();

        WebElement regester=driver.findElement(By.xpath("//*[@id='button-register']"));
        regester.click();

        WebElement BillingCheck=driver.findElement(By.xpath("//*[@id='button-payment-address']"));
        BillingCheck.click();

        WebElement Deliver=driver.findElement(By.xpath("//*[@id='button-shipping-address']"));
        Deliver.click();

        WebElement DeliveriMethod=driver.findElement(By.xpath("//*[@id='button-shipping-method']"));
        DeliveriMethod.click();

        WebElement agree=driver.findElement(By.xpath("//*[@name='agree']"));
        agree.click();

        WebElement paymentMethod=driver.findElement(By.xpath("//*[@id='button-payment-method']"));
        paymentMethod.click();

        WebElement Corfim=driver.findElement(By.xpath("//*[@id='button-confirm']"));
        Corfim.click();


    }

    @Test(priority = 5)
    public void Control(){
        WebElement control=driver.findElement(By.xpath("//div[@id='content'] /h1"));

        Assert.assertTrue(control.getText().toLowerCase().contains("your order has been placed!"),"istenilen sonuç elde edilemedi");
    }

}
