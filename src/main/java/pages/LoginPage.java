package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page {

    @FindBy (xpath = "//input[@id='user-name']")
    private WebElement usernameField;

    @FindBy (xpath = "//input[@id='password']")
    private WebElement passwordField;

    @FindBy (xpath = "//input[@id='login-button']")
    private WebElement loginButton;

    @FindBy (xpath = "//h3[@data-test='error']")
    private WebElement errorButton;

    public  LoginPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public LoginPage fillInUsername(String userName) {
        usernameField.sendKeys(userName);
        return this;
    }

    public LoginPage fillInPassword(String password) {
        passwordField.sendKeys(password);
        return this;
    }

    public void clickButton() {
        loginButton.click();
    }

    public String getErrorTextLogin () {
        return errorButton.getText();
    }

}
