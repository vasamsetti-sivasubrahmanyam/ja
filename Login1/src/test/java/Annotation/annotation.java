package Annotation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class annotation{ 
	   WebDriver driver = null; 
	   @Given("^that I am on login page$") 
		
	   public void goToFacebook() { 
		   System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver.exe");
	      driver = new ChromeDriver(); 
	      driver.navigate().to("https://www.github.com/login"); 
	   }
		
	   @When("^I enter username as (.*)$") 
	   public void enterUsername(String arg1) {   
	      driver.findElement(By.id("login_field")).sendKeys(arg1); 
	   }
		
	   @And ("^I enter password as (.*)$") 
	   public void enterPassword(String arg1) {
	      driver.findElement(By.id("password")).sendKeys(arg1);
	      /*driver.findElement(By.id("u_0_v")).click(); */
	   } 
		
	   @Then("^Alert successful$") 
	   public void checkpass() { 
		   driver.findElement(By.name("submit")).submit();
		   Alert alert=driver.switchTo().alert();
		   System.out.println(alert.getText());
		   assertEquals(alert.getText(), "Successful");
	   }
		
	   @Then("^I should relogin$") 
	   public void checkFail() { 
		   driver.findElement(By.name("commit")).click();
		   driver.navigate().to("https://www.github.com/session");
	   }
	}

