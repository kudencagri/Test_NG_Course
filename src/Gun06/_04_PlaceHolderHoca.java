package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

public class _04_PlaceHolderHoca extends BaseDriver {
    @Test
    public void ProceedToCheckout(){
        WebElement searchBox=driver.findElement(By.name("search"));
        searchBox.sendKeys("ipod"+ Keys.ENTER);

        WebElement addToChart=driver.findElement(By.xpath("//span[text()='Add to Cart']"));
        addToChart.click();

        WebElement shoppingChart=driver.findElement(By.linkText("Shopping Cart"));
        shoppingChart.click();

        WebElement checkOut=driver.findElement(By.linkText("Checkout"));
        checkOut.click();

        WebElement continue1=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        continue1.click();

        WebElement continue2=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        continue2.click();

        WebElement continue3=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        continue3.click();

        WebElement agree=driver.findElement(By.name("agree"));
        agree.click();

        WebElement continue4=wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        continue4.click();

        WebElement confirm=driver.findElement(By.id("button-confirm"));
        confirm.click();

        //wait.until(ExpectedConditions.urlToBe("http://opencart.abstracta.us/index.php?route=checkout/success"));
        wait.until(ExpectedConditions.urlContains("success"));

        WebElement ekranYazi = driver.findElement(By.xpath("//div[@id='content']/h1"));
        Assert.assertTrue(ekranYazi.getText().equals("Your order has been placed!"));
    }
}
