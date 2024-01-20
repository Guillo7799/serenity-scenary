package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("http://opencart.abstracta.us/")
public class CartPage {
    public static final Target BUTTON_SEE_CART = Target.the("Button resume cart").located(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a"));
    public static final Target CLICK_TO_CHECKOUT = Target.the("Button to checkout the purchase").located(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a"));
}
