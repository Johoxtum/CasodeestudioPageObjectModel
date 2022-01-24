Feature: Yo como usuario de PHPTRAVELS
  YO quiero crear un nuevo registro
  para acceder como cliente

  Scenario: Registrar exitosamente el nuevo usuario

    Given El usuario ingresa a la pagina
    When El usuario registra el formulario
    Then Se valida el mensaje de registro exitoso y se verifica el Login