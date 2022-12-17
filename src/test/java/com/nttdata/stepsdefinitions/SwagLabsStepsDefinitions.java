package com.nttdata.stepsdefinitions;

        import com.nttdata.screens.LoggedScreen;
        import com.nttdata.steps.SwagLabsLoginSteps;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;
        import net.thucydides.core.annotations.Steps;
        import org.junit.Assert;

public class SwagLabsStepsDefinitions {

    @Steps
    SwagLabsLoginSteps swagLabsLoginSteps;
    LoggedScreen loggedScreen;

    @Given("que me encuentro en la app de SwagLabs")
    public void que_me_enuentro_en_la_app_de_SwagLabs() {

    }

    @When("inicio sesion con el usuario {string} y la clave {string}")
    public void inicioSesionConElUsuarioYLaClave(String user, String password) {
        swagLabsLoginSteps.loginAppSwagLabs(user, password);
    }

    @Then("muestra el texto {string}")
    public void muestraElTexto(String texto) {
        Assert.assertEquals(loggedScreen.getResultText(), texto);
    }


    @And("verifico que exista la opcon {string} para confirmar que al menos hay un producto")
    public void verificoQueExistaLaOpconParaConfirmarQueAlMenosHayUnProducto(String textCarrito) {
        Assert.assertEquals(loggedScreen.getResultTextCarrito(), textCarrito);
    }
}
