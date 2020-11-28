package Gun09;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _01_SoftAssertVsHardAssert {
    /*
      Hard assert ve Soft assert
      AralarÄ±ndaki fark nedir?

      Hard assert fail olduÄŸu anda Ã§alÄ±ÅŸmayÄ± durdurur.
      Soft assert ise devam eder.
     */


    @Test
    public void hardAssert() {
        String s1 = "Merhaba";

        System.out.println("Hard assert oncesi");
        Assert.assertEquals("Merhaba123", s1); // burada fail oldu.
        System.out.println("Kod bitti.");
    }

    @Test
    public void softAssert()
    {
        String strHomePage="www.facebook.com/homepage";
        String strCartPage="www.facebook.com/cartpage";
        String strEditAccount="www.facebook.com/editaccountpage";


        SoftAssert _softAssert=new SoftAssert();

        _softAssert.assertEquals("www.facebook.com/homepage", strHomePage);
        System.out.println("assert 1");

        _softAssert.assertEquals("www.facebook.com/profile", strCartPage); // burda fail oluyor
        System.out.println("assert 2");

        _softAssert.assertEquals("www.facebook.com/settings", strEditAccount); // burda tekrar fail oluyor
        System.out.println("assert 3");

        _softAssert.assertAll(); // butn assertleri aktif ediyor.
        System.out.println("kod bitiÅŸi"); // bu butn asserAll dan sonra olduÄŸu iÃ§in ve
        // assertlerinde fail olduÄŸundan yukarÄ±da program kesilir.
    }




}

