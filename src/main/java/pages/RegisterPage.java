package pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


@DefaultUrl("https://www.phptravels.net/signup")
public class RegisterPage extends PageObject {
    @FindBy (name = "first_name")
    WebElement FIRSTNAME;
    @FindBy (name = "last_name")
    WebElement LASTNAME;
    @FindBy(name = "phone")
    WebElement PHONE;
    @FindBy(name = "email")
    WebElement EMAIL;
    @FindBy(name = "password")
    WebElement PASSWORD;
    @FindBy(id = "select2-account_type-container")
    WebElement ACCOUNT;
    @FindBy(xpath = "//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")
    WebElement BUTTON;
    @FindBy(xpath = "//h5[@class='modal-title title']")
    WebElement PAGE;
   /* @FindBy(xpath = "//span[@class='la la-envelope form-icon']")
    WebElement ICON;
     */

    public void diligenciarFormulario(){

        //WebDriver driver = null;

        //JavascriptExecutor jse = (JavascriptExecutor) driver;
        FIRSTNAME.sendKeys("Luis");
        LASTNAME.sendKeys("Perez");
        PHONE.sendKeys("3135414658");
        EMAIL.sendKeys("Juan1465@gmail.com");
        //jse.executeScript("arguments[0].scrollIntoView()",ICON);
        PASSWORD.sendKeys("Manzana123");
        ACCOUNT.click();
        BUTTON.click();

    }
    public String validacionurl(){

        return PAGE.getText();

    }




}