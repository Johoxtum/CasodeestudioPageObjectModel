Feature: Yo quiero como usuario de PHPTRAVELS
  yo quiero logear
  para acceder al menu principal

  Scenario: Acceder al dashboard
    Given El usuario ingresa a la pagina login
    When  El usuario ingresa sus credenciales
    Then  El usuario puede ver el mensaje de bienvenida Hi, Luis Welcome Back