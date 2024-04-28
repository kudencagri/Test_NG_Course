package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class _04_PlaceHolder_POM_PageObjectModel extends BaseDriver{

    @Test
    public void ProceedToCheckout(){

        _04_PlaceOrder_ELementleri eLements=new _04_PlaceOrder_ELementleri();

        eLements.searchBox.sendKeys("ipod"+ Keys.ENTER);
        eLements.addToChart.click();
        eLements.shoppingChart.click();
        eLements.checkOut.click();

        wait.until(ExpectedConditions.elementToBeClickable(eLements.continue1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(eLements.continue2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(eLements.continue3)).click();
        eLements.agree.click();
        wait.until(ExpectedConditions.elementToBeClickable(eLements.continue4)).click();

        eLements.confirm.click();

        wait.until(ExpectedConditions.urlContains("success"));

        Assert.assertTrue(eLements.msg.getText().equals("Your order has been placed!"));
    }

}
