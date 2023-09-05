package tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import service.InventoryPageService;
import service.LoginPageService;

public class LoginPageTest extends BaseTest{

    private LoginPageService loginPageService;
    private  User user;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
    }

    @Test
    public void checkSuccessfulLoginTest(){
        InventoryPageService inventoryPageService = loginPageService.login(user);
        String actualTextOfMainPageSection =  inventoryPageService.getActualNameOfMainPageSection();
        String expectedTextOfMainPageSection = "Products";
        Assert.assertEquals(actualTextOfMainPageSection, expectedTextOfMainPageSection, "Error!!!)");
    }

    @Test
    public void checkFailedLoginTest(){
        User userFailed = new User("Abcd","Qwer");
        InventoryPageService inventoryPageService = loginPageService.login(userFailed);
        String actualTextLoginError = loginPageService.getErrorTextLogin();
        String expectedTextLoginError = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(actualTextLoginError, expectedTextLoginError, "Error!!!)");
    }
}
