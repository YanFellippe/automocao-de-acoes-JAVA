package stepsDefinitions;

import static utils.Utils.Na;
import static utils.Utils.acessarSistema;
import static utils.Utils.*;


import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

public class Hooks {

	@Before(value = "not @login")
    public void setUp(){
	acessarSistema();
	Na(LoginPage.class).realizarLogin("Admin","admin123");
	
}

	
	@Before(value = "@login")
	public void funcionalidadeLogin(){
	acessarSistema();
		
	}
	
	@After()
    public void tearDown(Scenario scenario){
		capturarTela(scenario);
		driver.quit();
		
	}

}
