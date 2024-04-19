package Gun01;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _02_Annotations {

    @BeforeClass // classın içindekilerinden önce çalışır
    public void BaslangicIslemleri() {
        System.out.println("before class işlemleri çalıştı");
    }

    @Test // Annotations :metodun türünü ve çalışma özelliklerini belirtir.
    public void Test1() {                    // test1 : test metodunun adı
        System.out.println("Test 1 çalıştı");
    }

    @Test // Annotations :metodun türünü ve çalışma özelliklerini belirtir.
    public void Test2() {// test1 : test metodunun adı
        System.out.println("Test 2 çalıştı");
    }

    @AfterClass // classın içindekilerinden sonra çalışır
    public void BitisIslemleri() {
        System.out.println("after class işlemleri çalıştı");
    }
}