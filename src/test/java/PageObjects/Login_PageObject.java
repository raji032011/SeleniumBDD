package PageObjects;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import Base.BaseClass;

	public class Login_PageObject extends BaseClass {
		
		WebDriver ldriver;
		Actions a = new Actions(driver);
			
		public Login_PageObject(WebDriver rdriver)
		{
			ldriver = rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		// User Name Text Box
		@FindBy(xpath = "//input[@id='username']")
		WebElement UName;
		
		// Password Text Box
		@FindBy(xpath="//input[@id='password']")
		WebElement password; 
		
		//Log Button 
		@FindBy(xpath="//button[@id='login']")
		WebElement LogBut; 
		
		   public void UserName() {
			System.out.println("In Page Object");
			UName.sendKeys("LMS");
			}
		
			public void Password() {
			password.sendKeys("LMS");
			}
			
			public void LogButton() {
			LogBut.click();
				}


}
