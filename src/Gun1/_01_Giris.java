package Gun1;

import org.testng.annotations.Test;

public class _01_Giris {
    @Test(priority = 1)
        // annotation
    void vebSitesiAc() {
        System.out.println("Driver tanımlandı, ve web sitesi açıldı...");
    }

    @Test(priority = 2)
    void loginTest()
    {
        System.out.println("Login test işlemleri yapıldı");
    }

    @Test(priority = 3)
    void dirverKapat()
    {
        System.out.println("Driver kapatıldı ve çıkıldı.");
    }
}
