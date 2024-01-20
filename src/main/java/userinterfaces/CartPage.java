package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

import java.time.Duration;

@DefaultUrl("https://opencart.abstracta.us/index.php?route=checkout/checkout/")
public class CartPage {
    public static final Target BUTTON_SEE_CART = Target.the("Button resume cart").located(By.className("btn btn-inverse btn-block btn-lg dropdown-toggle")).waitingForNoMoreThan(Duration.ofSeconds(20));;
    public static final Target CLICK_TO_CHECKOUT = Target.the("Button to checkout the purchase").located(By.xpath("//*[@id=\"top-links\"]/ul/li[5]/a"));
}
