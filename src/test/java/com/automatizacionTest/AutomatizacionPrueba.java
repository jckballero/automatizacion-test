package com.automatizacionTest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatizacionPrueba {
	
	private WebDriver driver;

	By idLogo = By.id("header_logo");
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
			
	}
	@Test
	public void ingresoAutomationPracticeWeb() throws InterruptedException {
		
			
		Thread.sleep(2000); //2 SEGUNDOS DE ESPERA
		if(driver.findElement(idLogo).isDisplayed()) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//SCROLL DOWN
			js.executeScript("window.scrollBy(0,500)", ""); 
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,510)", ""); 
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,610)", ""); 
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,920)", ""); 
			Thread.sleep(5000);
			js.executeScript("window.scrollBy(0,980)", ""); 
			Thread.sleep(5000);
			//SCROLL UP
			js.executeScript("window.scrollBy(0,-3540)", ""); 
			Thread.sleep(5000);
		
			System.out.println("Estas en la pagina correcta");
		}else {
			System.out.println("Algo salió mal, no estas la página.");
		}
		
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(5000); //2 SEGUNDOS DE ESPERA, PARA CERRAR
		driver.quit();
	}
	
}
