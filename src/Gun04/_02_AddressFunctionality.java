package Gun04;

import Utils.MetodDriver;
import Utils.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.tools.Tool;
import java.util.List;

public class _02_AddressFunctionality extends MetodDriver {
    /*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.

     */

    @Test
    void AddAddress() throws InterruptedException {
        // Address Book -> linkText
        // New Address
//        input-firstname
//        input-lastname
//        input-company
//        input-address-1
//        input-address-2
//        input-city
//        input-postcode
//        input-country  select
//        input-zone
//
//input[value='Continue']

        WebElement AddressBookButton = driver.findElement(By.linkText("Address Book"));
        AddressBookButton.click();

        WebElement NewAddressButton = driver.findElement(By.linkText("New Address"));
        NewAddressButton.click();

        WebElement inputFirstName = driver.findElement(By.id("input-firstname"));
        inputFirstName.sendKeys("ismet");

        WebElement inputLastName = driver.findElement(By.id("input-lastname"));
        inputLastName.sendKeys("yılmaz");

        WebElement inputComppany = driver.findElement(By.id("input-company"));
        inputComppany.sendKeys("Techno Study");

        WebElement inputAddress1 = driver.findElement(By.id("input-address-1"));
        inputAddress1.sendKeys("21a London Road");

        WebElement inputAddress2 = driver.findElement(By.id("input-address-2"));
        inputAddress2.sendKeys("RG1 5BJ");

        WebElement inputCity = driver.findElement(By.id("input-city"));
        inputCity.sendKeys("Reading");

        WebElement inputProstCode = driver.findElement(By.id("input-postcode"));
        inputProstCode.sendKeys("12345");

        WebElement selectCountry = driver.findElement(By.id("input-country"));

        Tools.selectByIndex(selectCountry);

        WebDriverWait bekle = new WebDriverWait(driver, 10);

        By stateOptions = By.xpath("//select[@id='input-zone']/option");
        bekle.until(ExpectedConditions.numberOfElementsToBeMoreThan(stateOptions, 1));

        Thread.sleep(1000);

        WebElement selectState = driver.findElement(By.id("input-zone"));
        Tools.selectByIndex(selectState);

        WebElement btnContinue = driver.findElement(By.xpath("//input[@value='Continue']"));
        btnContinue.click();
        Tools.successMessageValidation(driver);
    }

    @Test(dependsOnMethods = {"AddAddress"})
    void EditAdress() {
        WebElement AddressBookButton = driver.findElement(By.linkText("Address Book"));
        AddressBookButton.click();

        // Bütün edit butonları alındı
        List<WebElement> editBtns = driver.findElements(By.xpath("//a[text()='Edit']"));
        editBtns.get(editBtns.size() - 1).click(); // ve sonucuya tıklandı

        WebElement inputFirstName = driver.findElement(By.id("input-firstname"));
        inputFirstName.clear();
        inputFirstName.sendKeys("Ahmet");

        WebElement inputLastName = driver.findElement(By.id("input-lastname"));
        inputLastName.clear();
        inputLastName.sendKeys("Demir");

        WebElement continueButton = driver.findElement(By.xpath("//input[@value='Continue']"));
        continueButton.click();

        Tools.successMessageValidation(driver);

    }

    @Test(dependsOnMethods = {"EditAdress"})
    void EditDElete() {
        WebElement adresBookButton = driver.findElement(By.linkText("Address Book"));
        adresBookButton.click();
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//a[text()='Delete']"));
        deleteButtons.get(deleteButtons.size() - 1).click();
        Tools.successMessageValidation(driver);
    }
}