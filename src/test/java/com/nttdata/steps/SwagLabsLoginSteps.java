package com.nttdata.steps;

        import com.nttdata.screens.*;
        import net.thucydides.core.annotations.Step;

public class SwagLabsLoginSteps {

    LoginScreenSwagLabs loginScreen;
    LoggedScreen loggedScreen;

    @Step("Inicio de sesión con usuario y contraseña {0}")
    public void loginAppSwagLabs(String user, String password){
        loginScreen.clickUserInput();
        loginScreen.enterUser(user);
        loginScreen.clickPasswordInput();
        loginScreen.enterPassword(password);
        loginScreen.clickLogin();
    }

    @Step("Obtiene el texto del resultado")
    public String getResultText(){
        return loggedScreen.getResultText();
    }

    @Step("Obtiene el texto del resultado add carrito")
    public String getResultTextCarrito(){
        return loggedScreen.getResultTextCarrito();
    }
}

