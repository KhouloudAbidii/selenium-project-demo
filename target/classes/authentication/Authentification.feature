@authentification
Feature: Je me connecte a l application OrangeHRM
  En tantque utilisateur je me souhaite m authentifier a l application OrangeHRM

  Background: 
    Given je me connecte a l application OrangeHRM
    When je saisis le username "Admin"
    And je saisis le mot de passe "admin123"
    And je clique sur le bouton login

  @connexion_ok
  Scenario: Authentification a l application OrangeHRM
    Then je me redirige vers la page home "Welcome"

  @deconnexion
  Scenario: Verifier la Deconnexion
    When je click sur l icone logout
    And je click sur le bouton logout
