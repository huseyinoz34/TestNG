package test.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilietes.ConfigReader;
import utilietes.Driver;

public class NegativeLoginTest {
HotelMyCampPage hotelMyCampPage;

    @Test

    public void negativLoginTest(){
     //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
        //3 Farkli test Methodunda 3 senaryoyu test et
        //                - yanlisSifre
        //                - yanlisKulllanici
        //                - yanlisSifreKullanici
        //test data yanlis username: manager1 , yanlis password : manager1
        //2) https://www.hotelmycamp.com adresine git
        //3) Login butonuna bas
        //4) Verilen senaryolar ile giris yapilamadigini test et

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
       hotelMyCampPage=new HotelMyCampPage();
       hotelMyCampPage.Loginbutunu.click();
       hotelMyCampPage.Kullanicikutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
       hotelMyCampPage.passbutonu.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
       hotelMyCampPage.login2butonu.click();
        Assert.assertTrue(hotelMyCampPage.girisyapilamdiyazisi.isDisplayed());


    }


}
