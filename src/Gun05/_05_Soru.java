package Gun05;
/* sisteme giriş yapıldığında istenilen menü varmı yerinde kontrol et
* */
import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _05_Soru extends BaseDriver {
    @Test
    public void MenuValidation(){
        //beklenen liste
        List<String> menuExpectedList=new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");

        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");

        menuExpectedList.add("MP3 Players");
        List<WebElement> menuActualList=driver.findElements(By.cssSelector("[class='nav navbar-nav'] > li"));

        for (int i = 0; i < menuExpectedList.size() ; i++) {
            Assert.assertEquals(menuActualList.get(i).getText(),menuExpectedList.get(i),"menu beklendiği gibi değil");
        }


    }


}
