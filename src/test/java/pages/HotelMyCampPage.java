package pages;

import net.bytebuddy.asm.Advice;
import org.checkerframework.common.returnsreceiver.qual.This;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilietes.ConfigReader;
import utilietes.Driver;

import javax.xml.xpath.XPath;

public class HotelMyCampPage {

   public HotelMyCampPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement Loginbutunu;

   @FindBy(id = "UserName")
    public WebElement Kullanicikutusu;

   @FindBy(id = "Password")
    public WebElement passbutonu;

   @FindBy(xpath="//input[@value='Log in']")
    public WebElement login2butonu;

   @FindBy(xpath = "//span[text()='ListOfUsers']")
    public WebElement girisdogrumayazisi;
   @FindBy(xpath = "//span[text()='Try again please']")
    public WebElement girisyapilamdiyazisi;
@FindBy(id = "menuHotels")
public WebElement hotelmangement;

@FindBy(xpath = "(//a[@href='/admin/HotelAdmin'])[1]")
public WebElement hotelList;

    @FindBy(xpath = "//span[@class='hidden-480'] ")
    public WebElement addHotelLinki;

@FindBy(xpath ="(//input[@class='form-control form-filter input-sm'])[1]")
  public WebElement createHotelCode;

@FindBy(xpath = "//input[@id='Code']")
public WebElement addHotelcode;

@FindBy(xpath = "/select[@id=‘IDGroup’]")
 public WebElement addselectGroup;

   public void girisYap(){
       Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
       Loginbutunu.click();
       Kullanicikutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
       passbutonu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
       login2butonu.click();
   }


}
