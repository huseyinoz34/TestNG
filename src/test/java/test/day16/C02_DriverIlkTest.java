package test.day16;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilietes.Driver;

public class C02_DriverIlkTest {

// POM pageObjectModel de farkli classlara farkil sekillerde ulasilmasi benimsenmistir.
    // Driver class i icin static yontemi kullanilir
    // Page Class lari icin ise obje uzerinden kullanilmasi tercih edilmistir/

    @Test
    public void test01(){

        //amazona git
        Driver.getDriver().get("http://www.amazon.com");

        //arama kutusuna Nutella yaz ve arat.
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        //arama sonuclarinin Nutella cerdigini test et.
        String actualSonucStr= amazonPage.sonucYazisiElementi.getText();

        Driver.closeDriver();

    }
    @Test
    public void test02(){

    }


    }



