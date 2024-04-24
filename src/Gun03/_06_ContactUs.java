package Gun03;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

/*
* siteye login oldugunuzda contact us bilgi yazın(Merhaba testing)  submit e tıkla sonra contact us yazısının çıktığını doğrula
*
* */
public class _06_ContactUs extends BaseDriver {
    @Test
    public void contact(){
        WebElement cont=driver.findElement(By.xpath("//a[text()='Contact Us']"));
        cont.click();

        WebElement metin=driver.findElement(By.id("input-enquiry"));
        metin.sendKeys("Merhaba Test Dünyası");

        WebElement buton=driver.findElement(By.xpath("//*[@value='Submit']"));
        buton.click();

        WebElement control=driver.findElement(By.linkText("Contact Us"));

        Assert.assertTrue(control.getText().contains("Contact Us"));

    }
}
