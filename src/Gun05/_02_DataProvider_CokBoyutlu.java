package Gun05;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _02_DataProvider_CokBoyutlu {
    @Test(dataProvider = "userData")
    public void userTest(String username, String password){
        // username,Password
        /*
        * ismet , 1234
        * mehmet, sifre5
        * ayse, benimSifrem1
        * */

        System.out.println(username+" "+password);
    }
    @DataProvider  // bu metoda data provider görevi verildi
    public  Object[][] userData(){  // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.
        Object[][] data={

                {"ihsan","12345665"},
                {"sokol","rustem5"},
                {"zeynep10","zeynep111"},
                {"serkan","serkan500"}

        };
        return data;

    }
}
