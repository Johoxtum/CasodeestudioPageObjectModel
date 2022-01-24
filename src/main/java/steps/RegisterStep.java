package steps;

import org.junit.Assert;
import pages.RegisterPage;
import net.thucydides.core.annotations.Step;
import pages.RegisterPage.*;

public class RegisterStep {

    RegisterPage registerPage;

    @Step
    public void abrirFormulario(){

        registerPage.open();
    }

    @Step
    public void diligenciarFormulario(){

        registerPage.diligenciarFormulario();
    }

    @Step
    public void validarFormulario(String urlLogin){

        Assert.assertEquals(registerPage.validacionurl(),urlLogin);
    }

}
