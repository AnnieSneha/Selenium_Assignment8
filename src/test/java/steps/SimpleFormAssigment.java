package steps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SimpleFormAssigment {
	 
	WebDriver driver;
	
	@Given("Open the browser and enter the URL")
	
	public void open_the_browser_and_enter_the_url() {
         
		driver=new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/simple-form?");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("User enters firstname,lastname,email,contactno")
	
	public void user_enters_firstname_lastname_email_contactno() {
		
		driver.findElement(By.id("firstName")).sendKeys("Millie");
		
		driver.findElement(By.id("lastName")).sendKeys("Brown");
        
		driver.findElement(By.id("email")).sendKeys("milliebooby12@gmail.com");
		
		driver.findElement(By.id("number")).sendKeys("9202482023");
	}

	@When("User enter the message on textbox")
	
	public void user_enter_the_message_on_textbox() {
		
		driver.findElement(By.cssSelector("textarea[rows='2']")).sendKeys("Hello Im Mille Booby Brown,youre favourite Eleven from Stranger Things and see you all very soon!!");

	}

	@Then("User clicks the submit button")
	
	public void user_clicks_the_submit_button() {
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();

	}

	@Then("Alert message should be displayed and click on Ok")
	
	public void alert_message_should_be_displayed_and_click_on_ok() {
		
         WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(12));
		 
		 wait.until(ExpectedConditions.alertIsPresent());
		
		 Alert ele = driver.switchTo().alert();
		
		 String alerttext=ele.getText();
		
		 System.out.println(alerttext);
		
		 ele.accept();
		
		 driver.close();

	}


}
