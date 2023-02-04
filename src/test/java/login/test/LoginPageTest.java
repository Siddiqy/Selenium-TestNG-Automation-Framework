package login.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import access.LoginClass;
import login.LoginPage;

public class LoginPageTest extends LoginClass {

	@Test(priority = 0, dataProvider="invalid_credentials")
	public void verifyInvalidLogin(String username, String password) {
		LoginPage login = new LoginPage(driver);
		login.typeUserid(username);
		login.typePassword(password);
		login.clickSignIn();
		Assert.assertEquals(login.invalidLoginMessage(), "Invalid credentials");
	}
	
	@Test(priority = 1, dataProvider="valid_credentials")
	public void verifyValidLogin(String username, String password) {
		LoginPage login = new LoginPage(driver);
		login.typeUserid(username);
		login.typePassword(password);
		login.clickSignIn();
		Assert.assertEquals(login.verifyDashboard(), "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");;
	}

	@DataProvider(name="invalid_credentials")
	public Object[][] invalidCredentials(){
		return new Object[][] {
			{"Admin", "Password"},
			{"User", "admin123"},
			{"Supervisor", "123456"}
		};
	}
	
	@DataProvider(name="valid_credentials")
	public Object[][] validCredentials(){
		return new Object[][] {
			{"Admin", "admin123"}
		};
	}
}
