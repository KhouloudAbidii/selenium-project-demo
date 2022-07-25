package com.e2etests.automation.step_definitions;

import org.junit.Assert;

import com.e2etests.automation.page_objects.AuthenticationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthenticationStepDefinition {

	private AuthenticationPage authenticationPage;

	public AuthenticationStepDefinition() {
		this.authenticationPage = new AuthenticationPage();

	}

	/* Login */
	@Given("je me connecte a l application OrangeHRM")
	public void jeMeConnecteALApplicationOrangeHRM() {
		authenticationPage.goToURL();

	}

	@When("je saisis le username {string}")
	public void jeSaisisLeUsername(String username) {
		authenticationPage.fillUsername(username);

	}

	@When("je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		authenticationPage.fillPassword(password);

	}

	@When("je clique sur le bouton login")
	public void jeCliqueSurLeBoutonLogin() {
		authenticationPage.clickOnbtnLogin();

	}

	@Then("je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String msg) {
		String message = AuthenticationPage.homePage.getText();
		Assert.assertTrue(message.contains(msg));
	}

	/* Logout */

	@When("je click sur l icone logout")
	public void jeClickSurLIconeLogout() {

		authenticationPage.clickOniconLogout();

	}

	@When("je click sur le bouton logout")
	public void jeClickSurLeBoutonLogout() throws InterruptedException   {
Thread.sleep(2000);
		authenticationPage.clickOnbtnLogout();

	}

}
