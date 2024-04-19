package Gun01;

import org.testng.annotations.Test;                    //*************************************************************buralaardan

public class _01_Giris {

//    public static void main(String[] args) {
//        DriverIslemleriniYap();
//        WebSitesiniAc();
//        LoginTestiniYap();
//    }

//    public void Test1(){
        //        DriverIslemleriniYap();             //*** içerden yaparsan testi başlatırsan sadece o testi yapar  yukardan yılzdızlı yerden yaparsan hepsini yapar.
//        WebSitesiniAc();
//        LoginTestiniYap();
   //
    @Test (priority = 1)   // default=0 aynı seviyeler yine alfabetik çalışıyor.
    public void DriverIslemleriniYap(){
        System.out.println("driverIslemleri yapıldı");

    }
    @Test(priority = 2)
    public void WebSitesiniAc(){
        System.out.println("webIslemleri yapıldı");
    }
    @Test(priority = 3)
    public void LoginTestitiniYap(){
        System.out.println("LoginIslemleri yapıldı");
    }
    @Test(priority = 4)
    public void driverKapat(){
        System.out.println("driverkapttoIslemleri yapıldı");
    }




}


