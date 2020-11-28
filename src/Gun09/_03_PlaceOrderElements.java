package Gun09;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_PlaceOrderElements {

    // Bu sayfadaki bÃ¼tÃ¼n elemenalrÄ±n driverlar baglantisi gerekiyor
    // bunun icin aÅŸaÄŸÄ±daki consructor eklendi ve icin PageFatory ile
    // driver uzerinden bu (this) sayfadaki butun elemnalar iliskilendirildi.
    // Boylece Sayfada dan nesne tÃ¼retildiÄŸi zaman degil, kullanÄ±ldÄ±ÄŸÄ±
    // anda elemanlarin bulunmasi aktif oluyor.Bu yontemle butun sayfalarda
    // ayni isimde elemanlar var ise buradaki tanilama hepsi icin gecerli hale
    // gelmis oluyor. bu yapiya Page Object Model (POM) adi veriliyor.
    public _03_PlaceOrderElements(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='search']")
    public WebElement searchInput;

    @FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
    public WebElement searchButton;

    @FindBy(xpath = "(//span[text()='Add to Cart'])[1]")
    public WebElement item1;

    @FindBy(xpath = "//span[text()='Shopping Cart']")
    public WebElement shoppingChart;

    @FindBy(linkText = "Checkout")
    public WebElement checkOut;

    @FindBy(id ="button-payment-address")
    public WebElement continu1;

    @FindBy(id ="button-shipping-address")
    public WebElement continu2;

    @FindBy(id ="collapse-shipping-address")
    public WebElement continu3;

    @FindBy(id ="button-shipping-method")
    public WebElement continu4;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkBox;

    @FindBy(id ="button-payment-method")
    public WebElement continu5;

    @FindBy(id ="button-confirm")
    public WebElement confirmButton;

    @FindBy(xpath = "//div[@id='content']/h1")
    public WebElement mesaj;

}

