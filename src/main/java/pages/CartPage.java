package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends Page {

    @FindBy(xpath = "//div//span[@class='title']")
    private WebElement userCartTitle;

    public CartPage() {
    }

    public String getCartTitleText() {
        return userCartTitle.getText();
    }

}
