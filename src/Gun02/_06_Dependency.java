package Gun02;

import Utility.BaseDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
// arabanın hareket sırası : Start, Drive ,Park, Stop
// araba çalışmadan park edemez oyüzden bağlı çalışacak


public class _06_Dependency {
    @Test
    public void Startcar(){System.out.println("Startcar");   //    Assert.fail();                       // **** Bu testin çalışması, StartCar ın Hatasız çalışmasına bağımlı
       }

    @Test(dependsOnMethods = {"Startcar"})
    public void DriveCar(){ System.out.println("DriveCar"); }

    @Test(dependsOnMethods = {"DriveCar","Startcar"})
    public void ParkCar(){System.out.println("ParkCar");}

    @Test(dependsOnMethods = {"ParkCar"},alwaysRun = true) // ALwaysRun=True sırasını bekler ama mutlaka çalışır günvenlik amaçlı
    public void StopCar(){System.out.println("Stoptcar");}
}
// aynı seviyedeki testleri için priority verilebilir.
