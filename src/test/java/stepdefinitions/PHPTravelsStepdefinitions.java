package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.LoginStep;
import steps.RegisterStep;


public class PHPTravelsStepdefinitions {

   @Steps
    RegisterStep register;

    @Given("^El usuario ingresa a la pagina$")
    public void elUsuarioIngresaALaPagina() {

        register.abrirFormulario();
    }


    @When("^El usuario registra el formulario$")
    public void elUsuarioRegistraElFormulario() {

      register.diligenciarFormulario();

    }

    @Then("^Se valida el mensaje de registro exitoso y se verifica el (.*)$")
    public void seValidaElMensajeDeRegistroExitoso(String urlLogin) {

        register.validarFormulario(urlLogin);

    }

    @Steps
    LoginStep loginStep;

    @Given("El usuario ingresa a la pagina login")
    public void elUsuarioIngresaALaPaginaLogin() {

     loginStep.abrirLogin();

    }
    @When("El usuario ingresa sus credenciales")
    public void elUsuarioIngresaSusCredenciales() {

     loginStep.diligenciarCredenciales();
    }
    @Then("^El usuario puede ver el mensaje de bienvenida (.*)$")
    public void elUsuarioPuedeVerExitosamenteElDashboard(String login) {

     loginStep.ingresoexitoso(login);

    }

}







