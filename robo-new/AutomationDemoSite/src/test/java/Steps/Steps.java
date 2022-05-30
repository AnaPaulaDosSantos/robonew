package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import Page.Page;
import io.cucumber.java.en.Given;

public class Steps {
	Elementos e = new Elementos();
	Page p = new Page();
	Metodos m = new Metodos();
	@Given("que o usuario Acesse a Url {string}")
	public void que_o_usuario_acesse_a_url(String url) {
	   m.ExecutarNavegador(url);
	}

	@Given("Preencha os campos")
	public void preencha_os_campos() throws InterruptedException {
		m.preencher(e.getCampoFistName(), "texto");
		m.Pausa(2500);
		m.preencher(e.getCampoLastName(), "texto");
		m.Pausa(2500);
		m.preencher(e.getCampoAddress(), "texto");
		m.Pausa(2500);
		m.preencher(e.getCampoEmailAddress(), "texto");
		m.Pausa(2500);
		m.preencher(e.getCampoPhone(), "texto");
		m.Pausa(2500);
		m.click(e.getBtnGender());
		m.Pausa(2500);
		m.click(e.getBtnHobbies());
		m.Pausa(2500);
		m.click(e.getBtnLanguages());
		m.Pausa(2500);
		m.click(e.getBtnLanguagesPortuguese());
		m.Pausa(2500);
		m.click(e.getBtnSkills());
		m.Pausa(2000);
		m.click(e.getBtnSkillJava());
		m.Pausa(2000);
	    m.click(e.getBtnSelectCountry());
		m.Pausa(2500);
		m.click(e.getBtnSlectCountryUnited());
		m.Pausa(2500);
		m.click(e.getBtnDay());
		m.Pausa(2500);
		m.click(e.getBtnDay28());
		m.Pausa(2500);
		m.click(e.getBtnMonth());
		m.Pausa(2500);
		m.click(e.getBtnMonthJune());
		m.Pausa(2500);
		m.click(e.getBtnYear());
		m.Pausa(2500);
		m.click(e.getBtnYear1987());
		m.Pausa(2500);
		m.preencher(e.getCampoPassword(), "texto");
		m.Pausa(2500);
		m.preencher(e.getCampoConfirmPassword(), "texto");
		m.Pausa(2500);
	}

	@Given("Selecione Submit")
	public void selecione_submit() {
	   m.submit();
	}

}
