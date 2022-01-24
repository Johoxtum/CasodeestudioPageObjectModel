package steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import pages.LoginPage;

public class LoginStep {

    LoginPage loginPage;

    @Step
    public void abrirLogin(){
        loginPage.open();
    }
    @Step
    public void diligenciarCredenciales(){

        loginPage.logear();
    }

    @Step
    public void ingresoexitoso(String login){

        Assert.assertEquals(loginPage.validacion(),login);
    }
}
