package Gun04;
import Utility.BaseDriver;
import Utility.BaseDriver_Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _03_Soru extends BaseDriver_Parameter {        // siteye girdiğinde specialde indirimli fiyatlar düştümü  onun kotrolünü yap sonrada 2 farklı browserda paralel test yap
    @Test
    public void Test(){
        WebElement speacail= driver.findElement(By.linkText("Specials"));
        speacail.click();

        List<WebElement> priceNewList=driver.findElements(By.xpath("//span[@class='price-new']"));
        List<WebElement> priceOldList=driver.findElements(By.xpath("//span[@class='price-old']"));

        Assert.assertTrue(priceNewList.size()==priceOldList.size(),"Hepsinde indirim varmı ?");

        for (int i = 0; i <priceNewList.size() ; i++)
        {
           double NewPrice=Double.parseDouble(priceNewList.get(i).getText().replaceAll("[^0-9.,]",""));
           double OldPrice=Double.parseDouble(priceOldList.get(i).getText().replaceAll("[^0-9.,]",""));

            System.out.println(NewPrice +" "+ OldPrice);
            Assert.assertTrue(NewPrice < OldPrice," Yeni fiyat eski fiyattan küçük değil");

        }


    }


}
