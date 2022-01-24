package pages;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.phptravels.net/login")
public class LoginPage extends PageObject {

    @FindBy(name = "email")
    WebElement EMAIL;
    @FindBy(name = "password")
    WebElement PASSWORD;
    @FindBy(xpath = "//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")
    WebElement BUTTON;
    @FindBy (xpath = "//h2[@class='sec__title font-size-30 text-white']")
    WebElement PAGE;

    public void logear(){
        EMAIL.sendKeys("Juan1465@gmail.com");
        PASSWORD.sendKeys("Manzana123");
        BUTTON.click();
    }

    public String validacion(){

        return PAGE.getText();

    }

}
