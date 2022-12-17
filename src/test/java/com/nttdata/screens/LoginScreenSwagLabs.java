package com.nttdata.screens;

        import io.appium.java_client.pagefactory.AndroidFindBy;
        import net.serenitybdd.core.pages.PageObject;
        import org.openqa.selenium.WebElement;

        import java.util.concurrent.TimeUnit;

public class LoginScreenSwagLabs extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]") //Captura el elemento input user
    private WebElement inputUser; //Guarda el elemento input capturado

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]") //Captura el elemento input password
    private WebElement inputPassword; //Guarda el elemento input password capturado

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]") //Captura el elemento button login
    private WebElement loginButton; //Guarda el elemento login capturado

    public void clickUserInput(){ //Click sobre la opción usuario
        inputUser.click();
    }

    public void enterUser(String user){ //Ingresa el usuario
        inputUser.sendKeys(user);
    }

    public void clickPasswordInput(){ //Click sobre la opción password
        inputPassword.click();
    }

    public void enterPassword(String password){ //Ingrea el password
        inputPassword.sendKeys(password);
    }

    public void clickLogin(){ //Click en el botón login
        loginButton.click();
    }
}

