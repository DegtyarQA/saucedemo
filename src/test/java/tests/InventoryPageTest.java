package tests;

import model.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.CartPage;
import service.CartPageService;
import service.InventoryPageService;
import service.LoginPageService;

public class InventoryPageTest extends BaseTest {

    private LoginPageService loginPageService;

    private User user;

    @BeforeClass
    public void setUp() {
        loginPageService = new LoginPageService();
        user = new User();
        InventoryPageService inventoryPageService;
    }

    @Test
    public void checkTransitionFromInventoryPageToCartPageTest() {
        InventoryPageService inventoryPageService = loginPageService.login(user);
        CartPageService cartPageService = inventoryPageService.transitionFromInventoryPageToCartPage();
        String actualTitleText = cartPageService.actualCartTitleText();
        String expectedCartTitleText = "Your Cart";
        Assert.assertEquals(actualTitleText, expectedCartTitleText, "text does not match");
    }

    @Test
    public void checkSuccessfullAddProductToCartTest() {
        InventoryPageService inventoryPageService = loginPageService.login(user);
        inventoryPageService.addFirstProductToCart();
        String actualTextRemoveButton = inventoryPageService.actualGetTextRemoveButton();
        String actualQuantityInCart = inventoryPageService.actualProductQuantityInCart();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualTextRemoveButton, ConstantsForAssert.EXPECT_TEXT_REMOVE_BUTTON, "Text button incorrect");
        softAssert.assertEquals(actualQuantityInCart, ConstantsForAssert.EXPECT_TEXT_QUANTITY_FOR_ONE_PRODUCT_IN_CART, "Quantity incorrect");
        softAssert.assertAll();
    }
}
