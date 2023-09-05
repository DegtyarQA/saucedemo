package service;

import model.User;
import pages.LoginPage;

public class LoginPageService {

    private static final String LOGIN_PAGE_URL = "https://www.saucedemo.com/";
    private LoginPage loginPage = new LoginPage();

    public InventoryPageService login(User user) {
        loginPage.openPage(LOGIN_PAGE_URL)
                .fillInUsername(user.getName())
                .fillInPassword(user.getPassword())
                .clickButton();
        return new InventoryPageService();
    }

    public String getErrorTextLogin() {
        return loginPage.getErrorTextLogin();
    }

}
