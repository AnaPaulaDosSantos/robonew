package Metodos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Elementos.Elementos;
import Page.Page;


public class Metodos {
	Page p = new Page();
	Elementos e = new Elementos();
	WebDriver driver;

	public void ExecutarNavegador(String url) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
		public void click(By elemento) {
			driver.findElement(elemento).click();
		}

		public void preencher(By elemento, String texto) {
			driver.findElement(elemento).sendKeys(texto);

		}

		public void Pausa(int tempo) throws InterruptedException {
			Thread.sleep(tempo);
		

	}

	public void submit() {
		p.click(e.btnSubmit);
	}
}
