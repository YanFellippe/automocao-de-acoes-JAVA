package pageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "txtUsername")
	private WebElement campoUsuario;
	
	@FindBy(name = "txtPassword")
	private WebElement campoSenha;
	
	@FindBy(name = "Submit")
	private WebElement botaoLogin;
	
	@FindBy(xpath = "//span[text()='( Username : Admin | Password : admin123 )']")
	private WebElement link;
	
	
		
	public void informarCampoUsuario(String usuario) {
		
		campoUsuario.sendKeys(usuario);
	}
	
    public void informarCampoSenha(String senha) {
		
		campoSenha.sendKeys(senha);
	}
    
    public void acionarBotaoLogin() {
		
		botaoLogin.click();
	}
    
    public void realizarLogin(String usuario, String senha) {
    	informarCampoUsuario(usuario);
    	informarCampoSenha(senha);
    	acionarBotaoLogin();    	
    	
    }


}
