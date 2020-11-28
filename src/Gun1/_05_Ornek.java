package Gun1;

import Utils.MetodDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _05_Ornek extends MetodDriver {
    @Test
    void loginKontrol()
    {
        WebElement email=driver.findElement(By.id("input-email"));
        email.sendKeys("asd@gmail.com");

        WebElement password=driver.findElement(By.id("input-password"));
        password.sendKeys("123qweasd");

        WebElement btnLogin=driver.findElement(By.cssSelector("input.btn-primary"));
        btnLogin.click();
    }
}
