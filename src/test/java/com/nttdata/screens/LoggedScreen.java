package com.nttdata.screens;

        import io.appium.java_client.pagefactory.AndroidFindBy;
        import net.serenitybdd.core.pages.PageObject;
        import org.openqa.selenium.WebElement;

public class LoggedScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView") //Capturo el texto "PRODUCTS"
    private WebElement resultText; //Guardo el texto "PRODUCTS"

    @AndroidFindBy(xpath = "(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView") //Capturo el texto añadir al carrito
    private WebElement textCarrito; //Guardao el texto "añadir al carrito"

    public String getResultText(){
        return resultText.getText();
    }

    public String getResultTextCarrito(){
        return textCarrito.getText();
    }
}

