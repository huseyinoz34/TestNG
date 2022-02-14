package test.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilietes.ConfigReader;
import utilietes.Driver;

public class PosiveLoginTest {

//1) com.techproed altinda bir package olustur : smoketest
//2) Bir Class olustur : PositiveTest
//3) Bir test method olustur positiveLoginTest()
//         https://www.hotelmycamp.com adresine git
//        login butonuna bas
//test data username: manager ,
//test data password : Manager1!
//Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et



    @Test
    public void positiveLoginTest(){
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.Loginbutunu.click();
        hotelMyCampPage.Kullanicikutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passbutonu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.login2butonu.click();
        Assert.assertTrue(hotelMyCampPage.girisdogrumayazisi.isDisplayed());
       // Driver.closeDriver();
    }






}
