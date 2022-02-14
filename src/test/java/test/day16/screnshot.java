package test.day16;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilietes.ConfigReader;
import utilietes.Driver;

import java.io.File;
import java.io.IOException;

public class screnshot {

    @Test
    public void amazonScreenshoz() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("AmazonUrl"));
        AmazonPage amazonPage= new AmazonPage();
        amazonPage.amazonAramaKutusu.click();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        Assert.assertTrue(amazonPage.sonucYazisiElementi.getText().contains("Nutella"));

    }
}
