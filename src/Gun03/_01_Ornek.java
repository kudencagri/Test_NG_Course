package Gun03;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

// siteye giriş yap adı soyadı otomatik değiştir.                 yanına ekleme hatası için clear kullanılır
public class _01_Ornek extends BaseDriver {
    @Test
    public void Account(){
        By EAcco=By.linkText("Edit Account");
        By FirstN=By.id("input-firstname");
        By SecndN=By.id("input-lastname");
        By Continue=By.xpath("//*[@value='Continue']");

        WebElement EditAcco=driver.findElement(EAcco);
        EditAcco.click();

        WebElement firstName=driver.findElement(FirstN);
        firstName.clear();
        firstName.sendKeys("Çağrı Canras");

        WebElement SecName=driver.findElement(SecndN);
        SecName.clear();
        SecName.sendKeys("Küden");

        WebElement Continiu=driver.findElement(Continue);
        Continiu.click();

        MyFunc.successMessageValidation();
    }


}
