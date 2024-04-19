package Gun01;

import org.testng.annotations.*;


/*
before class işlemleri çalıştı                       çalışma şekili
-------------------------------
beforeMethod işlemleri çalıştı
Test 1 çalıştı
afterMethod işlemleri çalıştı
-------------------------------
beforeMethod işlemleri çalıştı
Test 2 çalıştı
afterMethod işlemleri çalıştı
-------------------------------
afterclass işlemleri çalıştı
*
* */

public class _03_Annotations {

    @Test // Annotations :metodun türünü ve çalışma özelliklerini belirtir.
    public void Test1() {                    // test1 : test metodunun adı
        System.out.println("Test 1 çalıştı");
    }

    @Test // Annotations :metodun türünü ve çalışma özelliklerini belirtir.
    public void Test2() {// test1 : test metodunun adı
        System.out.println("Test 2 çalıştı");
    }

    @BeforeClass // classın içindekilerinden önce çalışır
    public void BaslangicIslemleri() {
        System.out.println("before class işlemleri çalıştı");
    }

    @AfterClass // classın içindekilerinden sonra çalışır
    public void BitisIslemleri() {
        System.out.println("afterclass işlemleri çalıştı");
    }
    @BeforeMethod // classın içindekilerinden önce çalışır
    public void beforeMethod() {
        System.out.println("beforeMethod işlemleri çalıştı");
    }

    @AfterMethod // classın içindekilerinden sonra çalışır
    public void AfterMothod() {
        System.out.println("afterMethod işlemleri çalıştı");
    }




}
