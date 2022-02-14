package test.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilietes.ConfigReader;
import utilietes.Driver;

public class C02_PropertiesIlk {

@Test
    public void positiveLoginTest(){

      //https://www. hotelmycamp.com/ adresine git
        //Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
    Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //        login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.Loginbutunu.click();
        //    test data username: manager ,
        hotelMyCampPage.Kullanicikutusu.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        //    test data password : Manager1!
        hotelMyCampPage.passbutonu.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.login2butonu.click();
        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        Assert.assertTrue(hotelMyCampPage.girisdogrumayazisi.isDisplayed());





    }


}

