package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _01_DataProvider {

    @Test(dataProvider = "datalarim")
    public void searchTest(String aranacaklarText) {
        System.out.println("aranacaklarText = " + aranacaklarText);
    }


    @DataProvider
    Object[] datalarim(){ // for gibi istenilen kadar çalıştırılır.

        String[] aranacalaklar={"mac","samsung","laptop"};

        return aranacalaklar;
    }
/**********************************************************************/
 @Test(dataProvider = "datalar") // dataProvidera verilen isimle çağıra bilirsiniz
    public void Test2(int veri){
     System.out.println("veri = " + veri);

 }

 @DataProvider(name="datalar") // kendin istersen vir isim verebilrisin
    Object[] getData(){
     Object[] data={1,2,3,4,5};
     return data;
    }












}

