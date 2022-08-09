package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

public class CadastrarUsuarioSteps {
	
	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
	    Na(TelaInicialPage.class).acionarAbaAdmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
		Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar no campo employer name {string}")
	public void informarNoCampoEmployerName(String employerName) {
		Na(CadastrarUsuarioPage.class).informarCampoEmployer(employerName);
	}

	@Quando("informar no campo username {string}")
	public void informarNoCampoUsername(String userName) {
		Na(CadastrarUsuarioPage.class).informarCampoUsername(userName);
	}

	@Quando("informar no campo password {string}")
	public void informarNoCampoPassword(String senha) {
		Na(CadastrarUsuarioPage.class).informarCampoPassword(senha);
	}

	@Quando("informaer no campo comfirmar password {string}")
	public void informaerNoCampoComfirmarPassword(String senha) {
		Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(senha);
	}
	
	@Quando("acionar o botao salvar")
	public void acionarOBotaoSalvar() {
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}

	@Entao("o sistema cadastra o usuario {string}")
	public void oSistemaCadastraOUsuario(String userName) {
	    assertTrue(driver.findElement(By.xpath("//Aravind[text()=" +userName+" ]")).isDisplayed());
	}


	
	
}
