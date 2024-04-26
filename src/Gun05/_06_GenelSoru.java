package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

// brands menusune gidin çıkan harflerle baş harflerinin öylemi başlıyor kontrol et
public class _06_GenelSoru extends BaseDriver {

    @Test
    public void Test() {
        WebElement brands = driver.findElement(By.linkText("Brands"));
        brands.click();

        List<WebElement> Expected = driver.findElements(By.xpath("//div[@id='content']/h2 "));
        List<WebElement> Words = driver.findElements(By.xpath("//div[@class='col-sm-3']/a "));


    }
}
