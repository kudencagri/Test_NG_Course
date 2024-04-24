package Gun02;

import Utility.BaseDriver;
import org.openqa.selenium.By;            // siteyi aç newsletter subscirebe işlemini abone olunuz(Yes) işlemini başarılı olduğunu kontorl ediniz
                                            // farklı işlemle abonelikten çıkın
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test; // login işlemi base drivera konuru çünkü before classa konur çünkü hertesten önce yapar. **************

public class _05_SubscribeNewsLetter extends BaseDriver {

    @Test
    public void NewsLetter(){
        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();


        WebElement SubscribeNO=driver.findElement(By.xpath("//input[@value='1']"));
        SubscribeNO.click();

        WebElement contuniue=driver.findElement(By.xpath("//input[@value='Continue']"));
        contuniue.click();

        WebElement AssertControl=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(AssertControl.getText().toLowerCase().contains("success"));
    }

    @Test
    public void NewsLetterno(){
        WebElement newsLetterLink=driver.findElement(By.linkText("Newsletter"));
        newsLetterLink.click();


        WebElement SubscribeYes=driver.findElement(By.xpath("//input[@value='0']"));
        SubscribeYes.click();

        WebElement contuniue=driver.findElement(By.xpath("//input[@value='Continue']"));
        contuniue.click();

        WebElement AssertControl=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(AssertControl.getText().toLowerCase().contains("success"));
    }

}
