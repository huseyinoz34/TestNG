package test.day17;

import org.testng.annotations.Test;
import utilietes.Driver;

public class C01HotelMyCampNegativ {


    @Test
    public void test1(){
   //1 ) Bir Class olustur : NegativeTest
        //2) Bir test method olustur NegativeLoginTest()
        //         https://www. hotelmycamp.com/ adresine git
        //        login butonuna bas
        //    test data username: manager1 ,
        //    test data password : manager1!
        //    Degerleri girildiginde sayfaya girilemedigini test et


        Driver.getDriver().get("https://www.HotelMyCamp.com");

    }




}
