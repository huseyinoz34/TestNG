package test.day16;

import org.testng.annotations.Test;
import utilietes.Driver;

public class C02_PageIlkClass {

    // amazona gidelim arama kutusuna Nutella yazip arayalim
    // aramalarin Nutella icerdigini test edelim

    @Test
    public void test(){
        Driver.getDriver().get("https://wwwamazon.com");

    }




}
