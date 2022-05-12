package qaautomation.march2022;

import org.testng.Assert;
import org.testng.annotations.Test;

import qaautomation.march2022.pages.LoginPageFactory;
import qaautomation.march2022.pages.ProfilePageFactory;

/**
 * Unit test for simple App.
 */
public class AppTestAfterPageFactory extends BaseWebTest {

	// karena semua extends dari BaseWebTest maka semua driver mesti menggunakan
	// driver.get()
	@Test
	public void test() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		loginPage.InputUsername(username);
		loginPage.InputPassword(password);
		loginPage.clickLoginBtn();

		String actualText = profilePage.getProfileText();
		String expectedText = "You logged into a secure area!";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginWithoutClick() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "SuperSecretPassword!";
		
		loginPage.InputUsername(username);
		loginPage.InputPassword(password);
		
		String actualText = loginPage.getBannerText();
		String expectedText = "Login Page";
		Assert.assertTrue(actualText.contains(expectedText));
	}

	@Test
	public void loginInvalidPassword() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		String username = "tomsmith";
		String password = "Salah";
		
		loginPage.InputUsername(username);
		loginPage.InputPassword(password);
		loginPage.clickLoginBtn();
		
		String actualText = profilePage.getProfileText();
		String expectedText = "Your password is invalid";
		Assert.assertTrue(actualText.contains(expectedText));
	}
	
	@Test
	public void loginInvalidUsername() {
		LoginPageFactory loginPage = new LoginPageFactory(driver, explicitWait);
		ProfilePageFactory profilePage = new ProfilePageFactory(driver, explicitWait);
		String username = "Salah";
		String password = "SuperSecretPassword!";
		
		loginPage.InputUsername(username);
		loginPage.InputPassword(password);
		loginPage.clickLoginBtn();
		
		String actualText2 = profilePage.getProfileText();
		String expectedText2 = "Your username is invalid";
		Assert.assertTrue(actualText2.contains(expectedText2));
	}
}
