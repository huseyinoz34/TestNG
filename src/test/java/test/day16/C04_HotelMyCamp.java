package test.day16;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilietes.Driver;

public class C04_HotelMyCamp {

    @Test
    public void Test(){

        Driver.getDriver().get("https://www.HotelMyCamp.com");
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.Loginbutunu.click();
        hotelMyCampPage.Kullanicikutusu.sendKeys("manager");
      hotelMyCampPage.passbutonu.sendKeys("Manager1!");
    hotelMyCampPage.login2butonu.click();
    
    }


}
