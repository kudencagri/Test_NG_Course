package Gun03;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*
* siteye login oldugunuzda contact us bilgi yazın(Merhaba testing)  submit e tıkla sonra contact us yazısının çıktığını doğrula
*
* */
public class _07_ContactUs_Parameter extends BaseDriver {
    @Test
    @Parameters("mesaj") // XML deki adı
    public void contact(String GelenMesaj){
        WebElement cont=driver.findElement(By.xpath("//a[text()='Contact Us']"));
        cont.click();

        WebElement metin=driver.findElement(By.id("input-enquiry"));
        metin.sendKeys(GelenMesaj);

        WebElement buton=driver.findElement(By.xpath("//*[@value='Submit']"));
        buton.click();

        WebElement control=driver.findElement(By.linkText("Contact Us"));

        Assert.assertTrue(control.getText().contains("Contact Us"));

    }
}
