package StepDefs;

import java.util.concurrent.TimeUnit;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDef {
	
	WebDriver driver = null;
	
	
	@Given("browser is open")
	public void browser_is_open() {
		
		String path = System.getProperty("user.dir");
		System.out.println("path"+path);
		System.setProperty("webdriver.chrome.driver",path+"/src/test/resources/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@Given("user is on google search page")
	public void user_is_on_google_search_page() throws InterruptedException {
	   driver.get("https://qalab-id.biomarking.com");
	   Thread.sleep(3000);
	}

	@When("user enter the text")
	public void user_enter_the_text() throws InterruptedException {
	   driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Automation");
	   Thread.sleep(2000);
	}

	@Then("hits enter")
	public void hits_enter() throws InterruptedException {
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}

	@Then("user is navigate to search results")
	public void user_is_navigate_to_search_results() {
		driver.getPageSource().contains("Automation - Wikipedia");
//	  driver.findElement(By.xpath("//h3[contains(@text,'Automation - Wikipedia')]"));
		driver.close();
	  
	}
}
