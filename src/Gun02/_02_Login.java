package Gun02;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _02_Login extends BaseDriver {
    @Test
    public void login(){
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        WebElement Input_email=driver.findElement(By.id("input-email"));
        Input_email.sendKeys("cagricanra@gmail.com");

        WebElement Input_Password=driver.findElement(By.id("input-password"));
        Input_Password.sendKeys("21tekno43");

        WebElement button=driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        button.click();

        Assert.assertTrue(driver.getTitle().equals("My Account"));
    }
}
