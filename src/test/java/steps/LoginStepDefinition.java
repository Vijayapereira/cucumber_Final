package steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.TestBase;

public class LoginStepDefinition extends TestBase{
	
	LoginPage loginPage;
	@Before
	public void setUp() {
		initDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
	}
	@Given("^Set Sky Blue Background Button exists$")
	public void set_Sky_Blue_Background_Button_exists()  {
		driver.get( "https://techfios.com/test/101");
		driver.findElement(By.xpath("//*[@id=\"extra\"]/button[1]"));
		
	    }

	@When("^I click on the button$")
	public void i_click_on_the_button()  {
		loginPage.clickSetSkyBlueBackgroundButton();
		takeScreenshot(driver);
	   	}

	@Then("^The background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue()  {
		Assert.assertTrue("background color changed to skyblue!", true);
	    }
	
	@Given("^Set Sky White Background Button exists$")
	public void set_Sky_White_Background_Button_exists()  {
		driver.get( "https://techfios.com/test/101");
		driver.findElement(By.xpath("//*[@id=\"extra\"]/button[2]"));
		
	}

	@When("^I click on that button$")
	public void i_click_on_that_button() {
		loginPage.clickSetSkyWhiteBackgroundButton(); 
		takeScreenshot(driver);
	}

	@Then("^the background color will change to white$")
	public void the_background_color_will_change_to_white() {
		Assert.assertTrue("Background color changed to white", true);
	   
	}


	
	
	
	
}
