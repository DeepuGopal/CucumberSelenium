package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	private static WebDriver driver;
	@Given("^I land on the flights page$")
	public void i_land_on_the_flights_page() throws Throwable {
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://newtours.demoaut.com/");
	   
	}

	@When("^I click Register$")
	public void i_click_Register() throws Throwable {
		driver.findElement(By.linkText("REGISTER")).click();
	   
	}

	@Then("^I verify the \"([^\"]*)\" link in page$")
	public void i_verify_the_success_link_in_page(String arg1) throws Throwable {
		String actual=arg1.trim();
		String expected="";
		try {
			expected=driver.findElement(By.xpath("//a[text()='"+actual+"']")).getText();
		}catch(Exception e) {
			
		}
		  
		 Assert.assertEquals("Passed", expected, actual);
		 driver.quit();
	    
	}

	

}
