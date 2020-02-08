package amazonShoppingCart;

import amazonSignIn.SignInPage;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;

public class ShoppingCartPage extends CommonAPI {

    @FindBy(css = "a[id='nav-cart']")
    WebElement shoppingCart;

    @FindBy(xpath = "//*[@id=\"sc-buy-box-ptc-button\"]/span")
    WebElement proceedToCheckout;

    @FindBy(xpath = "//*[@id=\"address-book-entry-0\"]/div[2]/span/a")
    WebElement deliverToThisAddress;

    @FindBy(xpath = "//*[@id=\"shippingOptionFormId\"]/div[1]/div[2]/div/span[1]")
    WebElement continueBTn;

    @FindBy(xpath = "//*[@id=\"checkoutDisplayPage\"]/div[1]")
    WebElement checkOutBtn;

    @FindBy(linkText = "Save for later")
    WebElement saveForLater;

    @FindBy(linkText = "Delete")
    WebElement delete;

    @FindBy(linkText = "Compare with similar items")
    WebElement compareItems;

    @FindBy(id = "101 73b55192-announce")
    WebElement dealItem;

    public void setUpLogin() {
        SignInPage signIn = PageFactory.initElements(driver, SignInPage.class);
        signIn.signIn("myautotestmail2020@gmail.com", "test2055");
    }

    public void goToShoppingCart() {
        shoppingCart.click();
    }
    public void addItemFromTodaysDeal(){
        clickOnElement("//*[@id=\"nav-xshop\"]/a[1]");
        dealItem.click();
    }

    public void deleteItemFromCart() {
        goToShoppingCart();
        delete.click(); //????
    }

    public void saveItemForLater() {
        goToShoppingCart();
        clickOnElement("//*[@id=\"sc-item-C28a72f58-f247-4a79-9bc7-1b2a35ec84e2\"]/div[4]/div/div[1]/div/div/div[2]/div/span[2]/span/input");//???
    }

    public void compareSimilarItems() {
        goToShoppingCart();
        compareItems.click();
    }
}
