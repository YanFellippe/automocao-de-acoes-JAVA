package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import static utils.Utils.*;

public class TelaInicialPage extends BasePage {
	
	Actions acao = new Actions(driver);
	
	//BasePage
	public void acionarAbaAdmin(){
		abaAdmin.click();
	}	
	
	//ELEMENTOS
	@FindBy(name = "btnAdd")
	public WebElement botaoAdd;
	
	public void acionarBotaoAdd(){
		botaoAdd.click();
	}
	
	public void acessarMenuCustomField(){
		acao.moveToElement(abaPim).build().perform();
		acao.moveToElement(menuConfiguration).build().perform();
		acao.moveToElement(menuField).click().build().perform();
	}		

		
}
