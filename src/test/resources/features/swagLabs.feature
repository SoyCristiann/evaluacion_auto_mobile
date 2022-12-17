Feature: Inicio de sesión en la app de Swag Labs

  @test
  Scenario: Iniciar sesión en la app de Swag Labs

    Given que me encuentro en la app de SwagLabs
    When inicio sesion con el usuario "standard_user" y la clave "secret_sauce"
    Then muestra el texto "PRODUCTS"
    And verifico que exista la opcon "ADD TO CART" para confirmar que al menos hay un producto