package Gun02;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;            // 1)siteyi aç newsletter subscirebe işlemini abone olunuz(Yes) işlemini başarılı olduğunu kontorl ediniz
                                            // 2)farklı işlemle abonelikten çıkın
import org.openqa.selenium.WebElement;     // 3) konttol edin no ise yes yes ise no yapın
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test; // login işlemi base drivera konuru çünkü before classa konur çünkü hertesten önce yapar. **************

public class _05_SubscribeNewsLetter extends BaseDriver {
    By Link=By.linkText("Newsletter");
    By suByes=By.xpath("//input[@value='1']");
    By cntBtn=By.xpath("//input[@value='Continue']");
    By suBNo=By.xpath("//input[@value='0']");

    @Test(priority = 1)
    public void NewsLetter(){
        WebElement newsLetterLink=driver.findElement(Link);
        newsLetterLink.click();


        WebElement SubscribeYes=driver.findElement(suByes);
        SubscribeYes.click();

        WebElement contuniue=driver.findElement(cntBtn);
        contuniue.click();

        WebElement AssertControl=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));   // MyFunc.successMessageValidation(); yetine geçiyor
        Assert.assertTrue(AssertControl.getText().toLowerCase().contains("success"));
    }

    @Test(priority = 2)
    public void NewsLetterno(){
        WebElement newsLetterLink=driver.findElement(Link);
        newsLetterLink.click();


        WebElement SubscribeNo=driver.findElement(suBNo);
        SubscribeNo.click();

        WebElement contuniue=driver.findElement(cntBtn);
        contuniue.click();

        MyFunc.successMessageValidation();
    }
    @Test(priority = 3)
    public void NewsLetterChange(){
        WebElement newsLetterLink=driver.findElement(Link);
        newsLetterLink.click();

        WebElement SubscribeYes=driver.findElement(suByes);
        WebElement SubscribeNO=driver.findElement(suBNo);

      if (SubscribeYes.isSelected()) {
          SubscribeNO.click();
      }else{
          SubscribeYes.click();
      }

        WebElement contuniue=driver.findElement(cntBtn);
        contuniue.click();

        MyFunc.successMessageValidation();
    }

}
