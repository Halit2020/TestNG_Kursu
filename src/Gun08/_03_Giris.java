package Gun08;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class _03_Giris {
    @Test(dataProvider = "getData") // senin dataproviderın getData isimli metoddur
    public void UsernameTest(String username)
    {
        System.out.println(username);
    }


    @DataProvider // bu metoda dataprovider görevi verildi.
    public Iterator<Object> getData() // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.
    {
        List<Object> data=new ArrayList<>();
        data.add("ahmet");
        data.add("ali");

        return data.iterator();

    }

}
