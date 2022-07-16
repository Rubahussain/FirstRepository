package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemologinPage {
	
	@FindBy(id="course")
	private WebElement coursebtn;
	
	@FindBy(name="addresstype")
	private WebElement dropdown;
	
	public WebElement getDropdown() {
		return dropdown;
	}

	@FindBy(xpath="//a[text()=' Selenium Training']")
	private WebElement seleniumtraining;
	
	public SkillraryDemologinPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void seleniumtrainingtab() {
		seleniumtraining.click();
	}

	public WebElement getCoursebtn() {
		return coursebtn;
	}
	
	
}
