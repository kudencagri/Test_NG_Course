package Gun06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _02_HardAssertVsSoftAssert {
    @Test
    public void HardAssert(){
        String s1="Merhaba";
        System.out.println(" Assert Öncesi" );
        Assert.assertEquals("Merhaba123",s1,"oluşanla beklenen aynı değil"); // Assertin özelliği hata oluştuğunda program kırılır

        System.out.println("Assert sonrası");

    }
    @Test
    public void SoftAssert(){                                            // hataları tutsun program kırılmasın
        String strHomePageAddres="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";

        SoftAssert _softAssert=new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage",strHomePageAddres);// pass
        System.out.println("Assert 1");

        _softAssert.assertEquals("www.facebook.com/profile",strCartPage);// fail
        System.out.println("Assert 2");

        _softAssert.assertEquals("www.facebook.com/settings",strEditAccount);// fail
        System.out.println("Assert 3");

        _softAssert.assertAll(); // bütün assert sonuçlarını işleme koyuyor.

        System.out.println("Soft assertAll: aktiflik sonrası"); // bu satır yazılmıyor kırılma noktasını belirledik. assertAll() ile


    }
}
