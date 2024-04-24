package Gun02;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _04_Assertions {

    @Test
    public void equalsOrnek(){
        String s1="Merhaba";
        String s2="Merhaba";


        // Actual(oluşan), Expected(beklenen), Mesaj(Opsiyonel)
        Assert.assertEquals(s1,s2," oluşanlanla beklenen aynı değil");
    }
    @Test
    public void NotequalsOrnek(){  // hatalı bekliyorum
        String s1="Merhaba1";
        String s2="Merhaba";

        Assert.assertNotEquals(s1,s2,"oluşanlanla beklenen aynı değil");
    }
    @Test
    public void TrueOrnek(){ // doğru bekliyırym
        String s1="Merhaba";
        String s2="Merhaba";



        Assert.assertTrue(s1.equals(s2)," oluşanlanla beklenen aynı değil");
    }
    @Test
    public void nullOrnek(){
        String s1=null;

        Assert.assertNull(s1,"oluşan Null olmadı");
    }
    @Test
    public void DirekFail(){
       int a=55;

       if (a !=55)
           Assert.fail();
    }
}
