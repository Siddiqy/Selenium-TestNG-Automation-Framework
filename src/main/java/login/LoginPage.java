package login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	By usernameField = By.name("username");
	By passField = By.name("password");
	By loginBtn = By.xpath("//button[text() = ' Login '] [@type = 'submit']");
	By title = By.xpath("//h6[text()='Dashboard']");
	By invalidMsg = By.xpath("//p[text() = 'Invalid credentials']");
	
	WebDriver driver;
	WebDriverWait wait;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public void typeUserid(String username) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField));
		driver.findElement(usernameField).clear();
		driver.findElement(usernameField).sendKeys(username);
	}
	
	public void typePassword(String password) {
		driver.findElement(passField).clear();
		driver.findElement(passField).sendKeys(password);
	}
	
	public void clickSignIn() {
		driver.findElement(loginBtn).submit();
	}
	
	public String verifyDashboard() {
		wait.until(ExpectedConditions.urlToBe("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"));
		return driver.getCurrentUrl();
	}
	
	public String invalidLoginMessage() {
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(invalidMsg));
		return driver.findElement(invalidMsg).getText();
	}
}
