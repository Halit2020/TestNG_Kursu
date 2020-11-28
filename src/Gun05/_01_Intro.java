package Gun05;

import org.testng.annotations.*;

public class _01_Intro {
@BeforeSuite
    public  void bsuit()
{
    System.out.println("Before Suite");
}
@BeforeTest
    public void btest()
{
    System.out.println("Before Test");
}

@BeforeGroups
    public void bgroups()
{
    System.out.println("Before Groups");
}
@BeforeClass
    public void bclass()
{
    System.out.println("Before Class");
}
@BeforeMethod
    public void bmethod()
{
    System.out.println("Before Method");
}
@Test
    public void test1()
{
    System.out.println("Test1");
}
@Test
    public void test2()
{
    System.out.println("Test2");

}
    @AfterMethod
    public void amethod()
    {
        System.out.println("After Method");

    }
    @AfterClass
    public void aclass()
    {
        System.out.println("After Class");

    }
    @AfterGroups
    public void agroups()
    {
        System.out.println("After Groups");
    }

    @AfterTest
    public void atest()
    {
        System.out.println("After Test");
    }
    @AfterSuite
    public  void asuit()
    {
        System.out.println("After Suite");
    }


    }
