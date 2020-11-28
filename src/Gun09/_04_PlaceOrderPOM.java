package Gun09;

import Utils.MetodDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _04_PlaceOrderPOM extends MetodDriver {
/* POM (Page Object Model) avantajlarÄ±
   1- Butun sayfalada isimleri ayni olan elemanlar icin 1 tanilama yeterli oluyor.
      Boylece tanilanan elemanlar tekrar kullanilabilir yani Reusable oluyor.
   2- Kodun icerisinden HTML kodlari ayrildigindan kod okunabilirliÄŸi artÄ±yor.
   3- Developer locatorlarda bir degisiklik yaptigi zaman, asil kodla hic bir sekilde
      ugrasmak zorunda kalmiyoruz, sadece gidip locator degistiriyoruz.
 */

    @Test
    public void ProceedToCheckout() {

        _03_PlaceOrderElements placeOrderElements=new _03_PlaceOrderElements(driver);

        placeOrderElements.searchInput.sendKeys("ipod");
        placeOrderElements.searchButton.click();
        placeOrderElements.item1.click();
        placeOrderElements.shoppingChart.click();
        placeOrderElements.checkOut.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continu1)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continu2)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continu3)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continu4)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.checkBox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.continu5)).click();
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderElements.confirmButton)).click();

        wait.until(ExpectedConditions.urlContains("success"));

        Assert.assertEquals(placeOrderElements.mesaj.getText(), "Your order has been placed!");
    }
}

