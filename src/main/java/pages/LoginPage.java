package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import javafx.scene.paint.Color;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	//Element Library
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")
	WebElement SkyBlueBackgroundButton;
	
		@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")
	WebElement WhiteBackgroundButton;
	
	//Methods to interact with the elements
	
	public void clickSetSkyBlueBackgroundButton() {
		
		SkyBlueBackgroundButton.click();
	}
	
	public boolean  validateBackgroundColorIsSkyBlue() {
	
		WebElement backgroundColor = driver.findElement(By.xpath(" \"//body[@style='background-color: skyblue;']"));
		String color = backgroundColor.getCssValue("Background");
		if(color =="#87ceeb") {
			
			return true;
				
				}
		return false;
	}
	public void clickSetSkyWhiteBackgroundButton() {
		WhiteBackgroundButton.click();
	}
	
	public boolean validateBackgroundcolorWhite() {
		
		WebElement backgroundColor1 = driver.findElement(By.xpath("//body[@style='background-color: white;']"));
		String color1 = backgroundColor1.getCssValue("Background");
		if(color1=="#FFFFFF") {
			return true;
		}
	
		return false;
		
	}

}
