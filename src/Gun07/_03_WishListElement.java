package Gun07;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _03_WishListElement {
    public _03_WishListElement() {
        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(name="search")
    public WebElement searchBox;
    @FindBy(xpath ="//button[@data-original-title='Add to Wish List']")
    public List<WebElement> wishButton;
    @FindBy(xpath = "//div[@class='caption']//h4")
    public List<WebElement> productList;
    @FindBy(xpath = "//span[contains(text(),'Wish List')]")
    public WebElement wishListLink;
    @FindBy(xpath = "//td[@class='text-left']/a")
    public List<WebElement> wishList;
    @FindBy(xpath = "//span[text()='Add to Cart']")
    public List<WebElement> addToChart;
    @FindBy(linkText = "Shopping Cart")
    public WebElement shoppingChart;
}
