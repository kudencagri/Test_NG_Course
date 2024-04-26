package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

/*
* daha önceki dersşerde yaptğımız Search Fonksiyonunu
* mac ipod ve samsung için Data provider ile yapınız
* */
public class _03_Soru extends BaseDriver {
    @Test(dataProvider = "nickData")
    public void Test(String marka){


            WebElement search=driver.findElement(By.name("search"));
            search.clear();
            search.sendKeys(marka+ Keys.ENTER);

        List<WebElement> captions=driver.findElements(By.cssSelector("[class='caption'] > h4"));

        for (WebElement e :captions){
            //System.out.println("e = " + e);
            Assert.assertTrue(e.getText().toLowerCase().contains(marka),"aranan Kelime bulunamadı");
        }


    }

    @DataProvider
    public Object[] nickData(){
        Object[] veri={"mac","ipod","samsung"};
                return veri;
    }

}
