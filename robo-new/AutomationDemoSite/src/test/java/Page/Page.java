package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
	WebDriver driver;

	public void click(By elemento) {
		driver.findElement(elemento).click();
	}

	public void preencher(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);

	}

	public void Pausa(int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
}
