package Gun04;
 // siteye girdiğinde specialde indirimli fiyatlar düştümü  onun kotrolünü yap sonrada 2 farklı browserda paralel test yap
import Utility.BaseDriver_Parameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _03_Soru extends BaseDriver_Parameter {
    @Test
    public void Test(){
        WebElement speacail= driver.findElement(By.linkText("Specials"));
        speacail.click();



    }
}
