package Gun02;

import Utility.BaseDriver;
import org.openqa.selenium.By;            // 1)siteyi aç newsletter subscirebe işlemini abone olunuz(Yes) işlemini başarılı olduğunu kontorl ediniz
                                            // 2)farklı işlemle abonelikten çıkın
import org.openqa.selenium.WebElement;     // 3) konttol edin no ise yes yes ise no yapın
import org.testng.Assert;
import org.testng.annotations.Test; // login işlemi base drivera konuru çünkü before classa konur çünkü hertesten önce yapar. **************

public class _05_SubscribeNewsLetter extends BaseDriver {

    @Test
    public void NewsLetter(){
        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();


        WebElement SubscribeYes=driver.findElement(By.xpath("//input[@value='1']"));
        SubscribeYes.click();

        WebElement contuniue=driver.findElement(By.xpath("//input[@value='Continue']"));
        contuniue.click();

        WebElement AssertControl=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(AssertControl.getText().toLowerCase().contains("success"));
    }

    @Test
    public void NewsLetterno(){
        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();


        WebElement SubscribeNo=driver.findElement(By.xpath("//input[@value='0']"));
        SubscribeNo.click();

        WebElement contuniue=driver.findElement(By.xpath("//input[@value='Continue']"));
        contuniue.click();

        WebElement AssertControl=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(AssertControl.getText().toLowerCase().contains("success"));
    }
    @Test
    public void NewsLetterChange(){
        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();

        WebElement SubscribeYes=driver.findElement(By.xpath("//input[@value='1']"));
        WebElement SubscribeNO=driver.findElement(By.xpath("//input[@value='0']"));



        WebElement contuniue=driver.findElement(By.xpath("//input[@value='Continue']"));
        contuniue.click();

        WebElement AssertControl=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(AssertControl.getText().toLowerCase().contains("success"));
    }

}
