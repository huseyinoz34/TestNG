package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilietes.Driver;

import java.util.List;

public class hmcWebTablePage {


 public hmcWebTablePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

   @FindBy (xpath = "//thead//tr[1]//th")
    public List<WebElement> headerBirinciSatirData;

    @FindBy (xpath = "//tbody//td")
    public List<WebElement> tumBodyElementi;

    @FindBy (xpath = "//tbody//tr")
    public List<WebElement> tumSatirlistesi;



}
