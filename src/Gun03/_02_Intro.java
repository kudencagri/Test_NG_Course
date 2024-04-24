package Gun03;
/*
 * @BeforeSuit   -> herşeyi kapsar.
 *   @BeforeTest  -->>  içinde çok metod, group class olan test Grubu
 *
 *     @BeforeGroup
 *
 *         @BeforeClass
 *             @BeforeMetod
 *                @Test test1()
 *             @AfterMetod
 *         @AfterClass
 *
 *     @AfterGroup
 *
 *   @AfterTest
 *
 * */

import org.testng.annotations.*;

public class _02_Intro {

    @BeforeSuite
    public void BeSuit(){System.out.println("Before Suite");}

    @BeforeTest
    public void BeTEST(){System.out.println("Before Test");}
    @BeforeGroups
    public void BeforeGr(){System.out.println("Before Group");}


   @Test
   public void Test1(){System.out.println("Test Çalışması");}

    @Test
    public void Test2(){System.out.println("Test Çalışması");}
    // arada class ve metod da var

    @AfterGroups
    public void AfterGr(){System.out.println("After Group");}
    @AfterSuite
    public void afSuit(){System.out.println("After Suite");}
    @AfterTest
    public void AfTEST(){System.out.println("After Test");}



}

